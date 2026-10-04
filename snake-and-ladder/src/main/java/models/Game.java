package models;

import enums.GameStatus;

import java.util.ArrayDeque;
import java.util.Queue;

public class Game {
    private final Board board;
    private GameStatus status;
    private final Queue<Player> players;
    private Player winner;

    public Game(Board board, Queue<Player> players) {
        this.board = board;

        if (players == null || players.size() < 2) {
            throw new IllegalArgumentException("Min 2 players");
        }

        this.players = new ArrayDeque<>(players);
        this.status = GameStatus.NOT_STARTED;
    }

    public void addPlayer(Player player) {
        if (player != null) {
            this.players.offer(player);
        }
    }

    public void start() {
        if (status != GameStatus.NOT_STARTED) {
            throw new IllegalStateException("Game has already started.");
        }

        if (players.size() < 2) {
            throw new IllegalArgumentException("Min 2 players required to start the game");
        }

        status = GameStatus.IN_PROGRESS;
        System.out.println("Game Started");
    }

    public void playTurn() {
        if (status != GameStatus.IN_PROGRESS) {
            throw new IllegalStateException("Game is not in progress.");
        }

        Player player = players.poll();
        if (player == null) {
            return;
        }

        System.out.println("==>" + player.getName() + " turn");

        int diceValue = player.getRollStrategy().roll();

        System.out.println(diceValue + " Rolled");

        int nextPosition = player.getPosition() + diceValue;

        System.out.println("==>" + player.getName() + " is at Position: " + nextPosition);

        if (nextPosition > board.getSize()) {
            System.out.println("Invalid Position, Player Cannot Move");
            players.offer(player);
            return;
        }

        nextPosition = board.resolvePosition(nextPosition);

        player.moveTo(nextPosition);

        if (nextPosition == board.getSize()) {
            winner = player;
            status = GameStatus.FINISHED;
            System.out.println("=== Player " + player.getName() + " has won the game! ===");
            return;
        }

        players.offer(player);
    }

    public Player getWinner() {
        return winner;
    }

    @Override
    public  String toString() {
        return "Game{" +
                "board=" + board +
                ", status=" + status +
                ", players=" + players +
                ", winner=" + winner +
                '}';
    }
}

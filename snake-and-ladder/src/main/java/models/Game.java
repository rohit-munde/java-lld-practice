package models;

import enums.GameStatus;

import java.util.ArrayDeque;
import java.util.Queue;

public class Game {
    private Board board;
    private Dice dice;
    private GameStatus status;
    private Queue<Player> players;
    private Player winner;

    public Game(Board board, Dice dice, Queue<Player> players) {
        this.board = board;
        this.dice = dice;

        if (players == null || players.size() < 2) {
            throw new IllegalArgumentException("Min 2 players");
        }

        this.players = new ArrayDeque<>(players);
        this.status = GameStatus.NOT_STARTED;
    }

    public Game(Board board, Dice dice) {
        this.board = board;
        this.dice = dice;
        this.players = new ArrayDeque<>();
        this.status = GameStatus.NOT_STARTED;
    }

    public void addPlayer(Player player) {
        if (player != null) {
            this.players.offer(player);
        }
    }

    public void Start() {
        if (players.size() < 2) {
            throw new IllegalArgumentException("Min 2 players required to start the game");
        }
        status = GameStatus.IN_PROGRESS;
        System.out.println("Game Started");
    }

    public void PlayTurn() {
        Player player = players.poll();
        if (player == null) {
            return;
        }

        System.out.println(player.getName() + " turn");

        int diceValue = dice.Roll();

        System.out.println(diceValue + " Rolled");

        int nextPosition = player.getPosition() + diceValue;

        if (nextPosition > board.getSize()) {
            System.out.println("Invalid Position, Player Cannot Move");
            players.offer(player);
            return;
        }

        nextPosition = board.ResolvePosition(nextPosition);

        player.MoveTo(nextPosition);

        if (nextPosition == board.getSize()) {
            winner = player;
            status = GameStatus.FINISHED;
            System.out.println("Player " + player.getName() + " has won the game!");
            return;
        }

        players.offer(player);
    }

    // Getters and Setters
    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Dice getDice() {
        return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    public GameStatus getStatus() {
        return status;
    }

    public Queue<Player> getPlayers() {
        return players;
    }

    public void setPlayers(Queue<Player> players) {
        this.players = players;
    }

    public Player getWinner() {
        return winner;
    }

    @Override
    public  String toString() {
        return "Game{" +
                "board=" + board +
                ", dice=" + dice +
                ", status=" + status +
                ", players=" + players +
                ", winner=" + winner +
                '}';
    }
}

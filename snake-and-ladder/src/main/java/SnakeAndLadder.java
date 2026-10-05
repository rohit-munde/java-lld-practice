import models.*;
import strategy.BiasedRollStrategy;
import strategy.CheatingStrategy;
import java.util.ArrayDeque;
import java.util.Queue;

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println("Snake and Ladder Game initialized.");

        //Board is initialised with 100 cells and jumps are added to the board.
        Board board = new Board(100);

        //Ladders
        board.addJump(new Ladder(2, 38));
        board.addJump(new Ladder(15, 35));
//        board.addJump(new Ladder(55, 95));

        //Snakes
        board.addJump(new Snake(67, 45));
        board.addJump(new Snake(75, 38));
        board.addJump(new Snake(90, 8));

        //set players now
        Queue<Player> players = new ArrayDeque<>(java.util.List.of(
                new Player("Player 1", "Rohit", new BiasedRollStrategy(6)),
                new Player("Player 2", "Vishal", new CheatingStrategy()),
                new Player("Player 3", "Guru UK wale", new CheatingStrategy()),
                new Player("Player 4", "Vandy", new CheatingStrategy())
        ));

        Game game = new Game(board, players);

        System.out.println(game);

        game.start();
        Player winner = game.getWinner();
        while (winner == null) {
            game.playTurn();
            winner = game.getWinner();
        }
        System.out.println("Winner is: " + winner.getName());
    }
}

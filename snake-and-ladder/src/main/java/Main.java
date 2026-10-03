import models.*;

import java.util.ArrayDeque;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("Snake and Ladder Game initialized.");

        //Board is initialised with 100 cells and jumps are added to the board.
        Board board = new Board();

        board.AddJump(new Jump(2, 38) {});
        board.AddJump(new Jump(15, 35) {});
        board.AddJump(new Jump(55, 95) {});

        board.AddJump(new Jump(67, 45) {});
        board.AddJump(new Jump(75, 38) {});
        board.AddJump(new Jump(90, 8) {});

        //set players now
        Queue<Player> players = new ArrayDeque<>(java.util.List.of(
                new Player("Player 1", "Rohit"),
                new Player("Player 2", "Vishal")
        ));

        Dice dice = new Dice(new NormalRollStrategy());

        Game game = new Game(board, dice, players);

        System.out.println(game);

    }
}

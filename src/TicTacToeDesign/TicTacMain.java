package TicTacToeDesign;

public class TicTacMain {

    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        System.out.println("game winner is " + game.startGame());



    }
}

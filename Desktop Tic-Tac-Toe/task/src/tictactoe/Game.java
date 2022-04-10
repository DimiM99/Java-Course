package tictactoe;

public class Game {
    static Player currenrtPlayer = Player.X;
    static status gameState = status.NOT_STARTED;

    public static void channgeCurrentPlayer() {
        switch (currenrtPlayer) {
            case O:
                currenrtPlayer = Player.X;
                break;
            case X:
                currenrtPlayer = Player.O;
                break;
            default:
                break;
        }
    }

    public static String getCurrentPlayer() {
        switch (currenrtPlayer) {
            case O:
                return "O";
            case X:
                return "X";
            default:
                return "";
        }
    }

    public static String getCurrentState() {
        switch (gameState) {
            case NOT_STARTED:
                return "Game is not started";
            case UNFINISHED:
                return "Game in progress";
            case X_WON:
                return "X wins";
            case O_WON:
                return "O wins";
            case DRAW:
                return "Draw";
            default:
                return "";
        }
    }
}

enum Player {
    X, O
}

enum status {
    X_WON, O_WON, DRAW, UNFINISHED, NOT_STARTED
}

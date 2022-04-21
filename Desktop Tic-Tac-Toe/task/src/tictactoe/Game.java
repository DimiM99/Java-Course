package tictactoe;

public class Game {
    static Player currentPlayer = Player.X;
    static status gameState = status.NOT_STARTED;

    static Player[] row1 = new Player[3];
    static Player[] row2 = new Player[3];
    static Player[] row3 = new Player[3];

    public static void changeCurrentPlayer() {
        switch (currentPlayer) {
            case O:
                currentPlayer = Player.X;
                break;
            case X:
                currentPlayer = Player.O;
                break;
            default:
                break;
        }
    }

    public static String getCurrentPlayer() {
        switch (currentPlayer) {
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

    public static boolean checkForPayer() {
        boolean result = false;
        if (TicTacToe.cellsPressed > 4) {
            try {
                if (row1[0].equals(currentPlayer) && row1[1].equals(currentPlayer) && row1[2].equals(currentPlayer)) {
                    result = true;
                }
            } catch (Exception ignored) {
            }
            try {
                if (row2[0].equals(currentPlayer) && row2[1].equals(currentPlayer) && row2[2].equals(currentPlayer)) {
                    result = true;
                }
            } catch (Exception ignored) {
            }
            try {
                if (row3[0].equals(currentPlayer) && row3[1].equals(currentPlayer) && row3[2].equals(currentPlayer)) {
                    result = true;
                }
            } catch (Exception ignored) {
            }
            try {
                if (row3[0].equals(currentPlayer) && row2[1].equals(currentPlayer) && row1[2].equals(currentPlayer)) {
                    result = true;
                }
            } catch (Exception ignored) {
            }
            try {
                if (row1[0].equals(currentPlayer) && row2[1].equals(currentPlayer) && row3[2].equals(currentPlayer)) {
                    result = true;
                }
            } catch (Exception ignored) {
            }
            try {
                if (row1[0].equals(currentPlayer) && row2[0].equals(currentPlayer) && row3[0].equals(currentPlayer)) {
                    result = true;
                }
            } catch (Exception ignored) {
            }
            try {
                if (row1[1].equals(currentPlayer) && row2[1].equals(currentPlayer) && row3[1].equals(currentPlayer)) {
                    result = true;
                }
            } catch (Exception ignored) {
            }
            try {
                if (row1[2].equals(currentPlayer) && row2[2].equals(currentPlayer) && row3[2].equals(currentPlayer)) {
                    result = true;
                }
            } catch (Exception ignored) {
            }
        }
        return result;
    }


    public static void checkWinner() {
        boolean WON = checkForPayer();
        if (WON) {
            switch (currentPlayer) {
                case X:
                    gameState = status.X_WON;
                    break;
                case O:
                    gameState = status.O_WON;
                    break;
            }
            TicTacToe.gameEnd();
        } else if (TicTacToe.cellsPressed == 9) {
            gameState = status.DRAW;
            TicTacToe.gameEnd();
        } else {
            gameState = status.UNFINISHED;
        }
        changeCurrentPlayer();
        TicTacToe.LabelStatus.setText(getCurrentState());
    }

}

enum Player {
    X, O
}

enum status {
    X_WON, O_WON, DRAW, UNFINISHED, NOT_STARTED
}

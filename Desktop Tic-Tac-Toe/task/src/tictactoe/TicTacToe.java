package tictactoe;

import javax.swing.*;
import java.awt.*;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
import java.util.Arrays;

public class TicTacToe extends JFrame {

    static Cell ButtonA1 = new Cell("ButtonA1", "A1");
    static Cell ButtonA2 = new Cell("ButtonA2", "A2");
    static Cell ButtonA3 = new Cell("ButtonA3", "A3");
    static Cell ButtonB1 = new Cell("ButtonB1", "B1");
    static Cell ButtonB2 = new Cell("ButtonB2", "B2");
    static Cell ButtonB3 = new Cell("ButtonB3", "B3");
    static Cell ButtonC1 = new Cell("ButtonC1", "C1");
    static Cell ButtonC2 = new Cell("ButtonC2", "C2");
    static Cell ButtonC3 = new Cell("ButtonC3", "C3");
    MenuButton ButtonReset = new MenuButton("ButtonReset", "Reset");
    static LabelStatus LabelStatus = new LabelStatus("LabelStatus", "");
    JPanel StatusBar = new JPanel(new GridLayout(1,2));
    JPanel GameField = new JPanel(new GridLayout(3,3));
    static int cellsPressed = 0;

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setLayout(new BorderLayout());

        add(GameField, BorderLayout.CENTER);
        add(StatusBar, BorderLayout.SOUTH);
        ButtonReset.setFocusPainted(false);

        GameField.add(ButtonA3,0);
        GameField.add(ButtonB3,1);
        GameField.add(ButtonC3,2);

        GameField.add(ButtonA2,3);
        GameField.add(ButtonB2,4);
        GameField.add(ButtonC2,5);

        GameField.add(ButtonA1,6);
        GameField.add(ButtonB1,7);
        GameField.add(ButtonC1,8);

        StatusBar.add(LabelStatus,0);
        StatusBar.add(ButtonReset,1);
        setVisible(true);
        resetGame();

        ButtonA1.addActionListener(actionEvent -> {
            if (ButtonA1.getText().equals(" ")) {
                ButtonA1.setText(Game.getCurrentPlayer());
                Game.row3[0] = Game.currentPlayer;
                cellsPressed++;
            } else {
                JOptionPane.showMessageDialog(null, "This cell is already taken");
            }
            Game.checkWinner();
        });

        ButtonA2.addActionListener(actionEvent -> {
            if (ButtonA2.getText().equals(" ")) {
                ButtonA2.setText(Game.getCurrentPlayer());
                Game.row2[0] = Game.currentPlayer;
                cellsPressed++;
            } else {
                JOptionPane.showMessageDialog(null, "This cell is already taken");
            }
            Game.checkWinner();
        });

        ButtonA3.addActionListener(actionEvent -> {
            if (ButtonA3.getText().equals(" ")) {
                ButtonA3.setText(Game.getCurrentPlayer());
                Game.row1[0] = Game.currentPlayer;
                cellsPressed++;
            } else {
                JOptionPane.showMessageDialog(null, "This cell is already taken");
            }
            Game.checkWinner();
        });

        ButtonB1.addActionListener(actionEvent -> {
            if (ButtonB1.getText().equals(" ")) {
                ButtonB1.setText(Game.getCurrentPlayer());
                Game.row3[1] = Game.currentPlayer;
                cellsPressed++;
            } else {
                JOptionPane.showMessageDialog(null, "This cell is already taken");
            }
            Game.checkWinner();
        });

        ButtonB2.addActionListener(actionEvent -> {
            if (ButtonB2.getText().equals(" ")) {
                ButtonB2.setText(Game.getCurrentPlayer());
                Game.row2[1] = Game.currentPlayer;
                cellsPressed++;
            } else {
                JOptionPane.showMessageDialog(null, "This cell is already taken");
            }
            Game.checkWinner();
        });

        ButtonB3.addActionListener(actionEvent -> {
            if (ButtonB3.getText().equals(" ")) {
                ButtonB3.setText(Game.getCurrentPlayer());
                Game.row1[1] = Game.currentPlayer;
                cellsPressed++;
            } else {
                JOptionPane.showMessageDialog(null, "This cell is already taken");
            }
            Game.checkWinner();
        });

        ButtonC1.addActionListener(actionEvent -> {
            if (ButtonC1.getText().equals(" ")) {
                ButtonC1.setText(Game.getCurrentPlayer());
                Game.row3[2] = Game.currentPlayer;
                cellsPressed++;
            } else {
                JOptionPane.showMessageDialog(null, "This cell is already taken");
            }
            Game.checkWinner();
        });

        ButtonC2.addActionListener(actionEvent -> {
            if (ButtonC2.getText().equals(" ")) {
                ButtonC2.setText(Game.getCurrentPlayer());
                Game.row2[2] = Game.currentPlayer;
                cellsPressed++;
            } else {
                JOptionPane.showMessageDialog(null, "This cell is already taken");
            }
            Game.checkWinner();
        });

        ButtonC3.addActionListener(actionEvent -> {
            if (ButtonC3.getText().equals(" ")) {
                ButtonC3.setText(Game.getCurrentPlayer());
                Game.row1[2] = Game.currentPlayer;
                cellsPressed++;
            } else {
                JOptionPane.showMessageDialog(null, "This cell is already taken");
            }
            Game.checkWinner();
        });

        ButtonReset.addActionListener(actionEvent -> resetGame());
    }



    public static void gameEnd() {
        ButtonA1.setEnabled(false);
        ButtonA2.setEnabled(false);
        ButtonA3.setEnabled(false);
        ButtonB1.setEnabled(false);
        ButtonB2.setEnabled(false);
        ButtonB3.setEnabled(false);
        ButtonC1.setEnabled(false);
        ButtonC2.setEnabled(false);
        ButtonC3.setEnabled(false);
    }

    public static void gameStart() {
        ButtonA1.setEnabled(true);
        ButtonA2.setEnabled(true);
        ButtonA3.setEnabled(true);
        ButtonB1.setEnabled(true);
        ButtonB2.setEnabled(true);
        ButtonB3.setEnabled(true);
        ButtonC1.setEnabled(true);
        ButtonC2.setEnabled(true);
        ButtonC3.setEnabled(true);
    }

    public void resetGame() {
        gameStart();
        ButtonA1.setText(" ");
        ButtonA2.setText(" ");
        ButtonA3.setText(" ");
        ButtonB1.setText(" ");
        ButtonB2.setText(" ");
        ButtonB3.setText(" ");
        ButtonC1.setText(" ");
        ButtonC2.setText(" ");
        ButtonC3.setText(" ");
        LabelStatus.setText("Game is not started");
        Game.currentPlayer = Player.X;
        Game.gameState = status.NOT_STARTED;
        Arrays.fill(Game.row1, null);
        Arrays.fill(Game.row2, null);
        Arrays.fill(Game.row3, null);
        cellsPressed = 0;
        LabelStatus.setText(Game.getCurrentState());
    }

}


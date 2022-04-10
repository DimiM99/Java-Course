package tictactoe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JFrame {

    Cell ButtonA1 = new Cell("ButtonA1", "A1");
    Cell ButtonA2 = new Cell("ButtonA2", "A2");
    Cell ButtonA3 = new Cell("ButtonA3", "A3");
    Cell ButtonB1 = new Cell("ButtonB1", "B1");
    Cell ButtonB2 = new Cell("ButtonB2", "B2");
    Cell ButtonB3 = new Cell("ButtonB3", "B3");
    Cell ButtonC1 = new Cell("ButtonC1", "C1");
    Cell ButtonC2 = new Cell("ButtonC2", "C2");
    Cell ButtonC3 = new Cell("ButtonC3", "C3");
    MenuButton ButtonReset = new MenuButton("ButtonReset", "Reset");
    LabelStatus LabelStatus = new LabelStatus("LabelStatus", "");
    JPanel StatusBar = new JPanel(new GridLayout(1,2));
    JPanel GameField = new JPanel(new GridLayout(3,3));

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

        ButtonA1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (ButtonA1.getText().equals(" ")) {
                    ButtonA1.setText(Game.getCurrentPlayer());
                    Game.channgeCurrentPlayer();
                } else {
                    JOptionPane.showMessageDialog(null, "This cell is already taken");
                }
                //checkWinner();
            }
        });

        ButtonA2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (ButtonA2.getText().equals(" ")) {
                    ButtonA2.setText(Game.getCurrentPlayer());
                    Game.channgeCurrentPlayer();
                } else {
                    JOptionPane.showMessageDialog(null, "This cell is already taken");
                }
                //checkWinner();
            }
        });

        ButtonA3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (ButtonA3.getText().equals(" ")) {
                    ButtonA3.setText(Game.getCurrentPlayer());
                    Game.channgeCurrentPlayer();
                } else {
                    JOptionPane.showMessageDialog(null, "This cell is already taken");
                }
                //checkWinner();
            }
        });

        ButtonB1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (ButtonB1.getText().equals(" ")) {
                    ButtonB1.setText(Game.getCurrentPlayer());
                    Game.channgeCurrentPlayer();
                } else {
                    JOptionPane.showMessageDialog(null, "This cell is already taken");
                }
                //checkWinner();
            }
        });

        ButtonB2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (ButtonB2.getText().equals(" ")) {
                    ButtonB2.setText(Game.getCurrentPlayer());
                    Game.channgeCurrentPlayer();
                } else {
                    JOptionPane.showMessageDialog(null, "This cell is already taken");
                }
                //checkWinner();
            }
        });

        ButtonB3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (ButtonB3.getText().equals(" ")) {
                    ButtonB3.setText(Game.getCurrentPlayer());
                    Game.channgeCurrentPlayer();
                } else {
                    JOptionPane.showMessageDialog(null, "This cell is already taken");
                }
                //checkWinner();
            }
        });

        ButtonC1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (ButtonC1.getText().equals(" ")) {
                    ButtonC1.setText(Game.getCurrentPlayer());
                    Game.channgeCurrentPlayer();
                } else {
                    JOptionPane.showMessageDialog(null, "This cell is already taken");
                }
                //checkWinner();
            }
        });

        ButtonC2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (ButtonC2.getText().equals(" ")) {
                    ButtonC2.setText(Game.getCurrentPlayer());
                    Game.channgeCurrentPlayer();
                } else {
                    JOptionPane.showMessageDialog(null, "This cell is already taken");
                }
                //checkWinner();
            }
        });

        ButtonC3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (ButtonC3.getText().equals(" ")) {
                    ButtonC3.setText(Game.getCurrentPlayer());
                    Game.channgeCurrentPlayer();
                } else {
                    JOptionPane.showMessageDialog(null, "This cell is already taken");
                }
                //checkWinner();
            }
        });

        ButtonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                resetGame();
            }
        });
    }

    public void resetGame() {
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
        Game.gameState = status.NOT_STARTED
    }

}


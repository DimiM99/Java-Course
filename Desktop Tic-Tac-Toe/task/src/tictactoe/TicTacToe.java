package tictactoe;

import javax.swing.*;
import java.awt.*;

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

    public TicTacToe() {
        setTitle("Tic Tac Toe");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        setLayout(new GridLayout(3, 3));

        add(ButtonA3,0);
        add(ButtonB3,1);
        add(ButtonC3,2);

        add(ButtonA2,3);
        add(ButtonB2,4);
        add(ButtonC2,5);

        add(ButtonA1,6);
        add(ButtonB1,7);
        add(ButtonC1,8);
        setVisible(true);
    }
}


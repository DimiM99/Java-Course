package tictactoe;

import javax.swing.*;

public class Cell extends JButton {
    Cell(String name, String text) {
        setName(name);
        setText(text);
        setEnabled(true);
    }
}

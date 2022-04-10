package tictactoe;

import javax.swing.*;


public class Cell extends JButton {
    Cell(String name, String text) {
        setName(name);
        setText(text);
        setFocusPainted(false);
        setEnabled(true);
    }

}

class MenuButton extends JButton {
    MenuButton(String name, String text) {
        setName(name);
        setText(text);
        setFocusPainted(false);
        setEnabled(true);
    }
}

class LabelStatus extends JLabel {
    LabelStatus(String name, String text) {
        setText(text);
        setName(name);
    }
}
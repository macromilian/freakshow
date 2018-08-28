package de.mkaminski.freakshow.testcode;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class StartTEST extends JFrame {

    private static final long serialVersionUID = 1L;

    public StartTEST() {

        initUI();
    }

    private void initUI() {

        add(new BoardTEST());

        setTitle("Pacman");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(380, 420);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            StartTEST ex = new StartTEST();
            ex.setVisible(true);
        });
    }
}
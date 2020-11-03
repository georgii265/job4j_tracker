package ru.job4j.Swing;

import javax.swing.*;
import java.awt.*;

public class SimpleFrameTest {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                SimpleFrameTest frame = new SimpleFrameTest();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }

    private void setVisible(boolean b) {
    }

    private void setDefaultCloseOperation(int exitOnClose) {
    }
}

package com.company;

import javax.swing.*;
import java.awt.*;

public class Cycle {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Counter");
        jFrame.setSize(500, 300);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setContentPane(new DrawPanel());
    }
}

class DrawPanel extends JPanel {
    public void paintComponent(Graphics graphics) {
        for (int i = 0; i < 10; i++) {
            graphics.setColor(Color.MAGENTA);
            graphics.fillRect(50 + i * 50, 50, 20, 20);
            JLabel jLabel = new JLabel();
            jLabel.setText(String.valueOf(i));
            jLabel.setBounds(50 + i * 50, 30, 20, 20);

            jLabel.setForeground(Color.pink);
            this.add(jLabel);
        }
    }
}
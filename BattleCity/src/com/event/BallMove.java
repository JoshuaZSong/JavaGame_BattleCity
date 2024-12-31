package com.event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class BallMove extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }

    public BallMove() {
        mp = new MyPanel();
        this.add(mp);
        this.addKeyListener(mp);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel implements KeyListener {



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(10, 10, 20, 20);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println((char)e.getKeyCode() + " is pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
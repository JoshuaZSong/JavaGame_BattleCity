package com.tankgame;

import javax.swing.*;

public class TankGame01 extends JFrame {

    MyPanel mp = null;
    public static void main(String[] args){

    }

    public TankGame01(){
        mp = new MyPanel();
        this.add(mp);
        this.setSize(100,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

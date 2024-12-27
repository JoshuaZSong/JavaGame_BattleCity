package com.tankgame;

import javax.swing.*;
import java.awt.*;

/**
 * drawing panel
 */
public class MyPanel extends JPanel {

    Hero hero = null;

    public MyPanel() {
        hero = new Hero(100, 100);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);

        //hero tank
        drawTank(hero.getX(), hero.getY(), g, 0, 0);

        //enemy tank
        drawTank(hero.getX() + 60, hero.getY(), g, 0, 1);
    }

    /**
     * @param x      tank's top-left conor x
     * @param y      tank's top-left conor y
     * @param g      draw
     * @param direct direction
     * @param type   hero/enemy
     */
    public void drawTank(int x, int y, Graphics g, int direct, int type) {

        switch (type) {
            case 0: // hero
                g.setColor(Color.cyan);
                break;
            case 1: //enemy tank
                g.setColor(Color.yellow);
                break;
        }

        switch (direct) {
            case 0://going up
                g.fill3DRect(x, y, 10, 60, false);//tank's left track
                g.fill3DRect(x + 30, y, 10, 60, false);//tank's left track
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//tank's body
                g.fillOval(x + 9, y + 19, 20, 20);//tank's cabin
                g.drawLine(x + 19, y + 30, x + 19, y);//tank's cannon
                break;
            default:
        }

    }
}

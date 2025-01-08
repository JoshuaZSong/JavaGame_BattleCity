package com.tankGame3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * drawing panel
 */
public class MyPanel extends JPanel implements KeyListener {

    Hero hero = null;
    //enemy tanks
    //using Vector - thread safe
    Vector<Enemy> enemyTanks = new Vector<>();
    int enemyTankSize = 3;

    public MyPanel() {
        hero = new Hero(100, 100);
        hero.setSpeed(2);

        //Initial enemy tanks
        for (int i = 0; i < enemyTankSize; i++) {
            Enemy enemy = new Enemy(100 * (i + 1), 0);
            enemy.setDirect(2);
            enemyTanks.add(enemy);
        }

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);

//        //enemy tank
//        drawTank(hero.getX(), hero.getY(), g, 0, 0);

        //hero tank
        drawTank(hero.getX() + 60, hero.getY(), g, hero.getDirect(), 1);

        //enemy tanks
        for (int i = 0; i < enemyTanks.size(); i++) {
            Enemy enemy = enemyTanks.get(i);
            drawTank(enemy.getX() + 60, enemy.getY(), g, enemy.getDirect(), 0);
        }
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
            case 0: //Enemy tank
                g.setColor(Color.cyan);
                break;
            case 1: //Hero
                g.setColor(Color.yellow);
                break;
        }

        //direction
        //0: up
        //1: right
        //2: down
        //3: left
        switch (direct) {
            case 0://going up
                g.fill3DRect(x, y, 10, 60, false);//tank's left track
                g.fill3DRect(x + 30, y, 10, 60, false);//tank's right track
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//tank's body
                g.fillOval(x + 9, y + 19, 20, 20);//tank's cabin
                g.drawLine(x + 19, y + 30, x + 19, y);//tank's cannon
                break;
            case 1://going right
                g.fill3DRect(x, y, 60, 10, false);//tank's left track
                g.fill3DRect(x, y + 30, 60, 10, false);//tank's right track
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//tank's body
                g.fillOval(x + 19, y + 9, 20, 20);//tank's cabin
                g.drawLine(x + 30, y + 19, x + 60, y + 19);//tank's cannon
                break;
            case 2://going down
                g.fill3DRect(x, y, 10, 60, false);//tank's left track
                g.fill3DRect(x + 30, y, 10, 60, false);//tank's right track
                g.fill3DRect(x + 10, y + 10, 20, 40, false);//tank's body
                g.fillOval(x + 9, y + 19, 20, 20);//tank's cabin
                g.drawLine(x + 19, y + 30, x + 19, y + 60);//tank's cannon
                break;
            case 3://going left
                g.fill3DRect(x, y, 60, 10, false);//tank's left track
                g.fill3DRect(x, y + 30, 60, 10, false);//tank's right track
                g.fill3DRect(x + 10, y + 10, 40, 20, false);//tank's body
                g.fillOval(x + 19, y + 9, 20, 20);//tank's cabin
                g.drawLine(x + 30, y + 19, x, y + 19);//tank's cannon
                break;
            default:
        }

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {//up
            hero.setDirect(0);
            hero.moveUp();
        } else if (e.getKeyCode() == KeyEvent.VK_D) {//right
            hero.setDirect(1);
            hero.moveRight();
        } else if (e.getKeyCode() == KeyEvent.VK_S) {//down
            hero.setDirect(2);
            hero.moveDown();
        } else if (e.getKeyCode() == KeyEvent.VK_A) {//left
            hero.setDirect(3);
            hero.moveLeft();
        }

        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

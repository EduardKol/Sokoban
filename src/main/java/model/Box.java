/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.*;


/**
 *
 * @author Колесников Эдуард
 */
public class Box extends CollisionObject implements Movable{

    public Box(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.yellow);

        int xc = getX();
        int yc = getY();
        int height = getHeight();
        int width = getWidth();

        graphics.drawRect(xc - width / 2, yc - height / 2, width, height);
        graphics.drawLine(xc - width / 2, yc - height / 2, xc + width / 2, yc + height / 2);
        graphics.drawLine(xc - width / 2, yc + height / 2, xc + width / 2, yc - height / 2);
    }

    @Override
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }
}
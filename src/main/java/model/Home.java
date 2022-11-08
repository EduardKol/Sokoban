/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Колесников Эдуард
 */
public class Home extends GameObject {
    
    private static final int SIZE = 2;
    
    public Home(int x, int y) {
        super(x, y, SIZE, SIZE);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.RED);
        
        int xc = getX();
        int yc = getY();
        int height = getHeight();
        int width = getWidth();
        
        graphics.drawOval(xc - width / 2, yc - height / 2, width, height);
    }
}

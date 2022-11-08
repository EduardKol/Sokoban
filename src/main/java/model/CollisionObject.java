/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Колесников Эдуард
 */
public abstract class CollisionObject extends GameObject {
    public CollisionObject(int x, int y) {
        super(x, y);
    }
    
    public boolean isCollision(GameObject gameObject, Direction direction) {
       switch (direction) {
           case LEFT:
               return ((x - Model.FIELD_CELL_SIZE) == gameObject.getX()) && (y == gameObject.getY());
           case RIGHT:
               return ((x + Model.FIELD_CELL_SIZE) == gameObject.getX()) && (y == gameObject.getY());
           case UP: 
               return  ((x == gameObject.getX() && (y - Model.FIELD_CELL_SIZE) == gameObject.getY()));
           case DOWN:
               return ((x == gameObject.getX() && (y + Model.FIELD_CELL_SIZE) == gameObject.getY()));
       }
       return false;
    }
}

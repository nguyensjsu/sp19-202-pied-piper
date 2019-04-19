import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class FoodBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FoodBoard extends Board
{
    /**
     * Act - do whatever the FoodBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    List<Board> list= new ArrayList <Board>();
    public void act() 
    {
        // Add your action code here.
    }
    public void update(Food food){
        food.count=food.count+1;

    }


}

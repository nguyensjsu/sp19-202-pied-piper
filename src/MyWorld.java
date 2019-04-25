import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

       
        super(1200, 700, 1); 
        GreenfootImage tile = new GreenfootImage(50,50);
        tile.drawRect(0,0,50,50);
        setBackground(tile);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Snake(), 125, 125);
        Food food = new Food();
        addObject(food,527,125);
        PowerUp powerUp = new PowerUp();
        addObject(powerUp,371,199);
    }
}

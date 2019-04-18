import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private SpeedDecorator sd;
    private Snake snake;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        sd = new SpeedDecorator();
        snake = new Snake();
        snake.wrapDecorator(sd);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(snake, 90, 90);
        Food food = new Food();
        addObject(food,527,125);
        PowerUp powerUp = new PowerUp();
        addObject(powerUp,371,199);
    }
}

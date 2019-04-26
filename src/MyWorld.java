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
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
      
       
      
        
        
        Snake snake=new Snake();
        PowerUpBoard powerupboard=new  PowerUpBoard();
        FoodBoard foodboard=new FoodBoard();
        ScoreBoard scoreboard=new ScoreBoard();
       
        Food food = new Food();
        food.attach(foodboard);
        food.attach(scoreboard);
        
        PowerUp powerUp = new PowerUp();
        powerUp.attach(powerupboard);
        powerUp.attach(scoreboard);
        
        addObject(snake, 90, 90);
        addObject(food,527,125);
        
        addObject(foodboard,20,20);
        addObject(powerupboard,600-20,20);
        addObject(scoreboard,600/2,20);
        addObject(powerUp,371,199);
    }
}

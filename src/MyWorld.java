import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
<<<<<<< HEAD
        super(1200, 700, 1);
=======

       
        super(1200, 700, 1); 
        GreenfootImage tile = new GreenfootImage(50,50);
        tile.drawRect(0,0,50,50);
        setBackground(tile);
>>>>>>> 1c2867ab28716b9f33b19bed7e61440bc88fae1f
        prepare();
        System.out.println("123");
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
<<<<<<< HEAD
        Snake snake=new Snake();
        PowerUpBoard powerupboard=new  PowerUpBoard();
        FoodBoard foodboard=new FoodBoard();
        ScoreBoard scoreboard=new ScoreBoard();
       
=======
        //addObject(new Snake(), 125, 125);
>>>>>>> 1c2867ab28716b9f33b19bed7e61440bc88fae1f
        Food food = new Food();
        food.attach(foodboard);
        food.attach(powerupboard);
        food.attach(scoreboard);
        
        PowerUp powerUp = new PowerUp();
        powerUp.attach(foodboard);
        powerUp.attach(powerupboard);
        powerUp.attach(scoreboard);
        
        addObject(snake, 90, 90);
        addObject(food,527,125);
        addObject(new FoodBoard(),20,20);
        addObject(new PowerUpBoard(),600-20,20);
        addObject(new ScoreBoard(),600/2,20);
        
        
        
  
        addObject(powerUp,371,199);
    }
}

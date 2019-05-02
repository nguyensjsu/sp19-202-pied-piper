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
        //addObject(new Snake(), 125, 125);
        this.setPaintOrder(NumberSpace.class,FoodBoard.class,PowerUpBoard.class,ScoreBoard.class);
        
        //Snake snake=new Snake();
        Board board=new Board();
        PowerUpBoard powerupboard=new  PowerUpBoard();
        FoodBoard foodboard=new FoodBoard();
        ScoreBoard scoreboard=new ScoreBoard();
        Food food = new Food();
        food.attach(foodboard);
        food.attach(scoreboard);
        addObject(food,525,125);
        PowerUp powerUp = new PowerUp();
        powerUp.attach(powerupboard);
        powerUp.attach(scoreboard);
        addObject(board,600,0);
        addObject(powerUp,375,175);
        addObject(foodboard,50,10);
        addObject(powerupboard,1150,10);
        addObject(scoreboard,600,10);
       
    }
}

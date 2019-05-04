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
    private Message message1;
    private Message message2;
    private Message message3;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

       
        super(1200, 700, 1); 
        //GreenfootImage tile = new GreenfootImage(50,50);
        //tile.drawRect(0,0,50,50);
        //setBackground(tile);
        GreenfootImage bg = new GreenfootImage("bg.png");
        setBackground(bg);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //addObject(new Snake(), 125, 125);
        this.setPaintOrder(Message.class,AchievementBoard.class, NumberSpace.class,FoodBoard.class,PowerUpBoard.class,ScoreBoard.class);
        
        //Snake snake=new Snake();
        Board board=new Board();
        PowerUpBoard powerupboard=new  PowerUpBoard();
        FoodBoard foodboard=new FoodBoard();
        ScoreBoard scoreboard=new ScoreBoard();
        AchievementBoard achievementboard = new AchievementBoard();
        Food food = new Food();
        food.attach(foodboard);
        foodboard.register(achievementboard);
        food.attach(scoreboard);
        addObject(food,525,125);
        PowerUp powerUp = new PowerUp();
        powerUp.attach(powerupboard);
        powerUp.attach(scoreboard);
        powerupboard.register(achievementboard);
        addObject(board,600,0);
        addObject(powerUp,375,175);
        addObject(foodboard,50,10);
        addObject(powerupboard,600,10);
        addObject(scoreboard,300,10);
        message3 = new Message("Achievements : ", 250, 80);
        addObject(message3, 800, 20);

    }
}

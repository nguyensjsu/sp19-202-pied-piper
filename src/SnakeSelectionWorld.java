import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeSelectionWorld extends World
{
    // Decorators for playable snake object
    private BlueSnakeDecorator bsd;
    private GreenSnakeDecorator gsd;
    private RedSnakeDecorator rsd;

    // Decorators for menu/selectable snake objects
    private MenuSnake ms;
    private MenuSnake ms2;
    private MenuSnake ms3;
    private BlueMenuSnake bms;
    private RedMenuSnake rms;
        
    private AchievementBoard achievementBoard;
    private Message message1;
    private Message message2;
    private Message message3;
    
    private MyWorld world;
    private Snake snake;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public SnakeSelectionWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage background = new GreenfootImage("snakeSelectionBg.png");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        
        // Prepare Green Snake
        ms = new MenuSnake();       
        ms.displaySnake();
        // Prepare Blue Snake
        ms2 = new MenuSnake();
        bms = new BlueMenuSnake();
        ms2.wrapSnakeMenuDecorator(bms);
        ms2.displaySnake();
        // Prepare Red Snake    
        ms3 = new MenuSnake();
        rms = new RedMenuSnake();
        ms3.wrapSnakeMenuDecorator(rms);
        ms3.displaySnake();
                
        achievementBoard = new AchievementBoard();
        prepare();
        //initialize myworld
        world = new MyWorld();
        //snake = new Snake();
        gsd = new GreenSnakeDecorator();
        bsd = new BlueSnakeDecorator();
        rsd = new RedSnakeDecorator();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {   
        /* add green snake */
        addObject(ms, 100, 150);
        //Add snake mode description 
        Label l1 = new Label("Easy", 22, Color.GREEN);
        addObject(l1, 180, 350);
        Label l11 = new Label("Recommended for beginners.\nPowerups will also grow the tail.\nThe starting length is longer.", 15, Color.BLACK);
        addObject(l11, 100, 390);

        /* add blue snake */
        addObject(ms2, 280, 150);
        Label l2 = new Label("Hard", 22, Color.BLUE);
        addObject(l2, 370, 350);
        Label l22 = new Label("The fastest snake. Powerups\nwill slow down the snake.", 15, Color.BLACK);
        addObject(l22, 310, 398);

        /* add red snake */
        addObject(ms3, 470, 150);
        Label l3 = new Label("Classic", 22, Color.RED);
        addObject(l3, 550, 350);
        Label l33 = new Label("The classic snake experience.\nPowerups speed up the snake.\nThe starting length is normal.", 15, Color.BLACK);
        addObject(l33, 500, 390);
        
        addObject(achievementBoard, 300 , 350);
        Food food = new Food();
        addObject(food ,180,340);
        PowerUp powerUp = new PowerUp();
        addObject(powerUp,180,380);
        message1 = new Message("* 5 = +50", 250, 80);
        addObject(message1, 330, 350);
        message2 = new Message("* 5 = +50", 250, 80);
        addObject(message2, 330, 390);
        message3 = new Message("Achievements", 250, 80);
        addObject(message3, 350, 320);
    }

    /*Choose different kinds snake by mouse click*/
    public void act() {
        // add snake to myworld and jump to myworld
        if(Greenfoot.mouseClicked(ms)) {
            /** Create snake objecr by Builder Design Partern**/
            snake = new Snake.Builder(gsd)
                    .snakeColor()
                    .snakeSpeed()
                    .snakeLife()
                    .snakeImage()
                    .build();

            /** Add snake object to world**/          
            world.addObject(snake, 175, 125);
            snake.prepare();
            Greenfoot.setWorld(world);
        } else if (Greenfoot.mouseClicked(ms2)) {
            //
            snake = new Snake.Builder(bsd)
                    .snakeColor()
                    .snakeSpeed()
                    .snakeLife()
                    .snakeImage()
                    .build();
            
            world.addObject(snake, 175, 125);
            snake.prepare();
            Greenfoot.setWorld(world);
        } else if (Greenfoot.mouseClicked(ms3)) {
            snake = new Snake.Builder(rsd)
                    .snakeColor()
                    .snakeSpeed()
                    .snakeLife()
                    .snakeImage()
                    .build();
          
            world.addObject(snake, 175, 125);
            snake.prepare();
            Greenfoot.setWorld(world);
        } 
    }
}

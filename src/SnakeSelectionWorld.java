import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnakeSelectionWorld extends World
{
    private BlueSnakeDecorator bsd;
    private GreenSnakeDecorator gsd;
    private RedSnakeDecorator rsd;
    //private SpeedDecorator sd;

    private GreenSnake gsnake;
    private BlueSnake bsnake;
    private RedSnake rsnake;

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
        gsnake = new GreenSnake();
        bsnake = new BlueSnake();
        rsnake = new RedSnake();
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
        addObject(gsnake, 100, 150);
        //Add snake mode description 
        Label l1 = new Label("Easy", 22, Color.GREEN);
        addObject(l1, 180, 350);

        /* add blue snake */
        addObject(bsnake, 280, 150);
        Label l2 = new Label("Medium", 22, Color.BLUE);
        addObject(l2, 350, 350);

        /* add red snake */
        addObject(rsnake, 470, 150);
        Label l3 = new Label("Hard", 22, Color.RED);
        addObject(l3, 550, 350);
    }

    /*Choose different kinds snake by mouse click*/
    public void act() {
        // add snake to myworld and jump to myworld
        if(Greenfoot.mouseClicked(gsnake)) {
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
        } else if (Greenfoot.mouseClicked(bsnake)) {
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
        } else if (Greenfoot.mouseClicked(rsnake)) {
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

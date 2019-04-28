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
        gsnake = new GreenSnake();
        bsnake = new BlueSnake();
        rsnake = new RedSnake();
        prepare();
        //initialize myworld
        world = new MyWorld();
        snake = new Snake();
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
        addObject(gsnake, 100, 90);
        addObject(bsnake, 300, 90);
        addObject(rsnake, 500, 90);
    }

    /*Choose different kinds snake by mouse click*/
    public void act() {
        // add snake to myworld and jump to myworld
        if(Greenfoot.mouseClicked(gsnake)) {
            snake.wrapSnakeDecorator(gsd);
            world.addObject(snake, 150, 125);
            Greenfoot.setWorld(world);
        } else if (Greenfoot.mouseClicked(bsnake)) {
            snake.wrapSnakeDecorator(bsd);
            world.addObject(snake, 150, 125);
            Greenfoot.setWorld(world);
        } else if (Greenfoot.mouseClicked(rsnake)) {
            snake.wrapSnakeDecorator(rsd);
            world.addObject(snake, 175, 125);
            Greenfoot.setWorld(world);
        } 
    }
}

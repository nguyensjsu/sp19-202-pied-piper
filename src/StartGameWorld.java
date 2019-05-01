import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartGameWorld extends World
{
    /**
     * Constructor for objects of class StartGameWorld.
     * 
     */
    private StartButton sb;
    private SnakeSelectionWorld ssw;
    
    public StartGameWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage background = new GreenfootImage("startScreenbg.png");
        background.scale(getWidth(), getHeight());
        setBackground(background);
        // Add start button
        sb = new StartButton();
        addObject(sb, 450, 300);
        ssw = new SnakeSelectionWorld();
    }

    public void act() {
        // when user press start button, go the snake selection world
        if(Greenfoot.mouseClicked(sb)) {
            Greenfoot.setWorld(ssw);
        }
    }
}

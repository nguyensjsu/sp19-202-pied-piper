import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int timer = 0; // Snake moves a unit (50 px) every 50 ticks
    public int speed = 2; // Speed multiplier for ticks
    
    public Snake(){
        GreenfootImage snakeImage = new GreenfootImage(50,50);
        snakeImage.fill();
        setImage(snakeImage);
    }
    
    public void act() 
    {
        timer += speed; // Timer increments based on speed value
        if (timer >= 50){ 
            move(50); // When timer hits 50, move 1 unit and reset timer
            timer = 0;
        }
                
        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
        }
        
        if(isTouching(PowerUp.class)){
            speed++;
        }  
        
        if(isAtEdge()){
            Greenfoot.playSound("Hiss.mp3");
            Greenfoot.stop();
        }
    }    
}

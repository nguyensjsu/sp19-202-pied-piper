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
    //int speed = 2;
    private int speed;
    private ISpeedDecorator speedDecorator;

    public Snake(){
        speed = 1;
    }

    public void wrapDecorator(ISpeedDecorator sd) {
        this.speedDecorator = sd;
    }
  
    
    public void act() 
    {
        move(speed);
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
            //speed++;
            speed = speedDecorator.increaseSpeed(speed);
        }  
        
        if(isAtEdge()){
            Greenfoot.playSound("Hiss.mp3");
            Greenfoot.stop();
        }
    }    
}

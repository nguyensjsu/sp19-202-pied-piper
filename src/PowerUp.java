import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUp extends Item implements Subject
{
    /**
     * Act - do whatever the PowerUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Snake.class)){
            Greenfoot.playSound("PowerUp.mp3");
        }  
        super.act();
    }    
    public void attach(Board board){};
    public void remove(){};
    public void mynotify(){};
}

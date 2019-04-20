import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerUpBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUpBoard extends Board
{
    /**
     * Act - do whatever the PowerUpBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int count=0;
    public void act() 
    {
       
    }
    public void update(PowerUp powerUp){
    powerUp.count=powerUp.count+1;
    
    }
    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ReplayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ReplayButton extends Actor
{
    /**
     * Act - do whatever the ReplayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
      private GreenfootImage buttonImage;

    public ReplayButton(){
        buttonImage = new GreenfootImage("replay.png");
        buttonImage.scale(120,50);
        setImage(buttonImage);
    } 
}

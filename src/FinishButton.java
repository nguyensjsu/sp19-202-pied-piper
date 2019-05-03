import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FinishButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FinishButton extends Actor
{
    private GreenfootImage buttonImage;

    public FinishButton(){
        buttonImage = new GreenfootImage("finish.png");
        buttonImage.scale(80,50);
        setImage(buttonImage);
    }  
}

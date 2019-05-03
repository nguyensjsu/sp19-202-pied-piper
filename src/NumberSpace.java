import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class UnitsSpace here.
 * 
 * @author (HaoRan Chen) 
 * @version (4/19)
 */
public class NumberSpace extends Actor
{
    /**
     * Act - do whatever the UnitsSpace wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage number;
    public void act() 
    {
        // Add your action code here.
    }
    public  NumberSpace(GreenfootImage number){
    this.number=number;
    this.number.scale(50,50);
    }
    public void set_the_Image(){
    this.setImage(number);
    }
}

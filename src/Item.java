import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Item here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item extends Actor
{
    /**
     * Act - do whatever the Item wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int count=0;
    public void act() 
    {
        if(isTouching(Snake.class)){
            setLocation(coordinate(Greenfoot.getRandomNumber(21)),
            coordinate(Greenfoot.getRandomNumber(11)));
        }        
    }
    public int coordinate(int i){
        i = (i+2)*50;
        return i+25;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int a){
        count=a;
    }
}

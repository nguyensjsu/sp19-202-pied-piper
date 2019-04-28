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
            setLocation(Greenfoot.getRandomNumber(coordinate(9)),
            Greenfoot.getRandomNumber(coordinate(4)));
        }        
    }
    public int coordinate(int i){
        i = (i+2)*100;
        return i;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int a){
        count=a;
    }
}

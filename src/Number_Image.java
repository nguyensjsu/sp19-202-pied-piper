import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.ArrayList;

/**
 * Write a description of class Number_Image here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Number_Image extends Actor implements Product
{
    /**
     * Act - do whatever the Number_Image wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private ArrayList list;
    public void act() 
    {
        // Add your action code here.
    }

    @Override
    public Number_Image getProduct() {
        return this;
    }
    public ArrayList getmyImage(){
        return list;
    }
    public void setList(ArrayList list){this.list=list;}

}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.ArrayList;

/**
 * Write a description of class Number_Image here.
 * 
 * @author (HaoRan Chen) 
 * @version (4/19)
 */
public class Number_Image extends Actor implements Product
{
    /**
     * Act - do whatever the Number_Image wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private ArrayList list=new ArrayList<Object>();
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
    public Number_Image(){}

}

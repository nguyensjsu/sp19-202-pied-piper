import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class FoodBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FoodBoard extends Board
{
    /**
     * Act - do whatever the FoodBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Number_Image number_image;
    private int count=0;
    List<Board> list= new ArrayList <Board>();
    public void act() 
    {
        // Add your action code here.
        
        
    }
    public void update(){
     setCount(count+1);
     show(getCount());
    }
    public void show(int count){
     FoodBoard_Number_Factory number_factory=new FoodBoard_Number_Factory();
     number_image=number_factory.makeImage(count);
     ArrayList list=number_image.getmyImage();
     GreenfootImage units=(GreenfootImage) list.get(0);
     GreenfootImage digits=(GreenfootImage)list.get(1);
     GreenfootImage foodboardimage=this.getImage();
     foodboardimage.drawImage(units,  0,  20);
     foodboardimage.drawImage(digits, 10,  20);

    }
    public int getCount(){
    return count;
    }
    public void setCount(int a){ count=a;}
   

}

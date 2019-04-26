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
    
    List<Board> list= new ArrayList <Board>();
    public void act() 
    {
        // Add your action code here.
        
        
    }
    public void update(Item item){
      Food food=(Food)item;
        
     food.setCount(food.getCount()+1);
    
     show(food.getCount());
    }
    public void show(int count){
        
     Count_Number_Factory number_factory=new Count_Number_Factory();
     number_image=number_factory.makeImage(count);
     ArrayList list=number_image.getmyImage();
     GreenfootImage units=(GreenfootImage) list.get(0);
     GreenfootImage digits=(GreenfootImage)list.get(1);
     getImage().clear();
     this.getWorld().getBackground().drawImage(units,35, 0);
     this.getWorld().getBackground().drawImage(digits, 0, 0);
    
     //GreenfootImage foodboardimage=this.getImage();
    
   

    }
    
   

}

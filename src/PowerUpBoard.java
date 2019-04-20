import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class PowerUpBoard extends Board
{
    /**
     * Act - do whatever the PowerUpBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Number_Image number_image;
    
    List<Board> list= new ArrayList <Board>();
    public void act() 
    {
      
    }
    public void update(Item item){
        PowerUp powerup=(PowerUp)item;
        
     powerup.setCount(powerup.getCount()+1);
    
     show(powerup.getCount());
    
    } public void show(int count){
       
     Count_Number_Factory number_factory=new Count_Number_Factory();
     number_image=number_factory.makeImage(count);
     ArrayList list=number_image.getmyImage();
     GreenfootImage units=(GreenfootImage) list.get(0);
     GreenfootImage digits=(GreenfootImage)list.get(1);
     getImage().clear();
     this.getWorld().getBackground().drawImage(units,600-35, 0);
     this.getWorld().getBackground().drawImage(digits, 600-70, 0);
    
     //GreenfootImage foodboardimage=this.getImage();
    
   

    }
    
    
    
}

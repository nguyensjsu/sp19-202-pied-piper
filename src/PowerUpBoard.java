import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


import java.util.ArrayList;
import java.util.List;
/**
     * Write a description of class FoodBoard here.
     * 
     * @author (HaoRan Chen) 
     * @version (4/19)
     */
public class PowerUpBoard extends Board
{
    /**
     * Act - do whatever the PowerUpBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Number_Image number_image;
    
    List<Board> list= new ArrayList <Board>();
    public PowerUpBoard(){
     Color bgColor = new Color(0, 0, 0, 0);
     GreenfootImage bg=new GreenfootImage("speed:",40,Color.RED,bgColor);
     bg.scale(100,50);
     setImage(bg);
      
    }
    
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
     world=this.getWorld();
     
     unitsspace=new NumberSpace(units);
     unitsspace.set_the_Image();
     digitsspace=new NumberSpace(digits);
     digitsspace.set_the_Image();
     
     
    
     //world.addObject(digitsspace,50,50);
     world.addObject(unitsspace,1175,70);
     world.addObject(digitsspace,1125,70);
     
     
     
     
     //this.getImage().clear();
     //this.getWorld().getBackground().drawImage(units,1145, 0);
     //this.getWorld().getBackground().drawImage(digits,1080, 0);
    
     //GreenfootImage foodboardimage=this.getImage();
    
   

    }
    
    
    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Board
{
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Number_Image number_image;
    int powerupcount=0;
    int score=0;
    public ScoreBoard(){
        GreenfootImage bg = new GreenfootImage("space1.jpg");
        bg.scale(2400,200);
        setImage(bg);
    }
    public void act() 
    {
        // Add your action code here.
    }

    @Override
    public void update(Item item) {
      
        if(item instanceof Food){
            if(powerupcount==0){score=score+1;}
            score=score+2*powerupcount;
            setScore(score);
        } 
        else{
            powerupcount+=1;
        }
      
        show(score);
    }
   
    public void setScore(int a){score=a;}
    public void show(int a){
     Count_Number_Factory number_factory=new Count_Number_Factory();
     number_image=number_factory.makeImage(score);
     ArrayList list=number_image.getmyImage();
     GreenfootImage units=(GreenfootImage) list.get(0);
     GreenfootImage digits=(GreenfootImage)list.get(1);
     
     
     
     world=this.getWorld();
     
     unitsspace=new NumberSpace(units);
     unitsspace.set_the_Image();
     digitsspace=new NumberSpace(digits);
     digitsspace.set_the_Image();
     
     
    
    
     world.addObject(unitsspace,625,50);
     world.addObject(digitsspace,575,50);
    
    }

}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


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
    private NumberSpace hundredsspace;
    int powerupcount=0;
    int score=0;
    public ScoreBoard(){
     Color bgColor = new Color(0, 0, 0, 0);
     GreenfootImage bg=new GreenfootImage("score:",40,Color.RED,bgColor);
     bg.scale(100,50);
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
     GreenfootImage hundreds=(GreenfootImage)list.get(2);
    
     
     
     world=this.getWorld();
     
     unitsspace=new NumberSpace(units);
     unitsspace.set_the_Image();
     digitsspace=new NumberSpace(digits);
     digitsspace.set_the_Image();
     hundredsspace=new NumberSpace(hundreds);
     hundredsspace.set_the_Image();
     
     world.addObject(unitsspace,660,70);
     world.addObject(digitsspace,610,70);
     world.addObject(hundredsspace,560,70);
    }

}

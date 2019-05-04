import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (HaoRan Chen) 
 * @version (4/19)
 */
public class ScoreBoard extends Board
{
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static ScoreBoard instance;
    private Number_Image number_image;
    private NumberSpace hundredsspace;
    int powerupcount=0;
    public static int score=0;
    
    public ScoreBoard(){
     Color bgColor = new Color(0, 0, 0, 0);
     GreenfootImage bg=new GreenfootImage("Score:",40,Color.RED,bgColor);
     bg.scale(100,50);
     setImage(bg);
     
    }
    public void act() 
    {
        // Add your action code here.
         if(score==0){
        show(score);}
    }

    public void update(Item item) {
      
        ScoreBoard scb = ScoreBoard.getInstance();
            
        if(item instanceof Food){
            if(powerupcount==0){score=score+1;}
            score=score+2*powerupcount;
            scb.setScore(score);
        } 
        else{
            powerupcount+=1;
        }
      
        show(this.score);
    }
   
    public void setScore(int a){this.score=a;}
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
     
     world.addObject(unitsspace,360,70);
     world.addObject(digitsspace,310,70);
     world.addObject(hundredsspace,260,70);
     //world.addObject(unitsspace,260,70);
     //world.addObject(digitsspace,210,70);
     //world.addObject(hundredsspace,160,70);
    }
    
    public static ScoreBoard getInstance() {
	if (null==instance)
	instance = new ScoreBoard();
	return instance;
    }
	
    public int getscore(){
        return this.score;
    }

}

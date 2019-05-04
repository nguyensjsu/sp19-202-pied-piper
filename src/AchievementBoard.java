import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.*;
import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class AchievementBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AchievementBoard extends Board implements IObserver
{
    /**
     * Act - do whatever the AchievementBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int score = 0;


    private Number_Image number_image;
    private Food food;
    private static int count = 0;
    
    private Message message1;
    
    private ScoreBoard scoreboard;
    
    /**
     * Constructor of the Achievement Board class.
     * Everything in the constructor is executed when the world is created.
     */
    public AchievementBoard()
    {    
       GreenfootImage image=getImage();
       image.scale(1000,50);  
       setImage(image);
       setRotation(180);
       
    }
    
    public void act() 
    {
        // Add your action code here.
        
    }    
    
    public void update(Item item) {
        
        scoreboard = scoreboard.getInstance();
        
        int currentscore = scoreboard.getscore();
        currentscore = currentscore + 10;
        scoreboard.setScore(currentscore);  
        
        //world=this.getWorld();
        
    }
    
    public void show(int a){
        
    }
    
    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class LeaderBoardScore here.
 * 
 * @author Jake
 * @version 1.0 / Apr 19 2019
 */

public class LeaderBoardScore extends LeaderBoardComponent
{
    private int score;
    private int posX;
    private int posY;
    
     public LeaderBoardScore(int text, int x, int y)
    {
        score=text;
        posX=x;
        posY=y;
    }
    
    /**
     * Act - do whatever the LeaderBoardScore wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {   
        
        // Add your action code here.
    }    
    
     public void printOnScreen() {
        Label l1 = new Label(""+score, 30, Color.WHITE);
        getWorld().addObject(l1, posX+60, posY+82);
        //getWorld().showText(""+score, posX, posY);
    }
     
    public void addChild(LeaderBoardComponent c){}
    public void removeChild(LeaderBoardComponent c){}
    public LeaderBoardComponent getChild(int i){
        return null;
    }
    
    
}

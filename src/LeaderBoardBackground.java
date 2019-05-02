import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeaderBoardBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeaderBoardBackground extends LeaderBoardComponent
{
     
     private GreenfootImage image1;
     
    public LeaderBoardBackground()
    {
       GreenfootImage image=getImage();
       image.scale(1200,700);  
       setImage(image);
       //setRotation(90);
    }
    
    public void printOnScreen() {}
    public void addChild(LeaderBoardComponent c){}
    public void removeChild(LeaderBoardComponent c){}
     public LeaderBoardComponent getChild(int i){
        return null;
    }
    
    /**
     * Act - do whatever the LeaderBoardBackground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeaderBoardScreen extends World
{

    public Label label;
         
    /**
     * Constructor for objects of class BackGround.
     * 
     */
    public LeaderBoardScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }
    
        private void prepare()
    {
        
         
        Label label = new Label("LEADER BOARD");
        addObject(label, 280, 75);
        
        UserInfo userinfo = new UserInfo();
        addObject(userinfo,180,125);  
        
        UserInfo userinfo2 = new UserInfo();
        addObject(userinfo2,180,225);
        
        UserInfo userinfo3 = new UserInfo();
        addObject(userinfo3,180,325);
    }
    
}

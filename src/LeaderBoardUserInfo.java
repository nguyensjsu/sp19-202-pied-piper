import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class UserInfo here.
 * 
 * @author Jake
 * @version 1.0 / Apr 19 2019
 */
public class LeaderBoardUserInfo extends LeaderBoardComponent
{
    /**
     * Act - do whatever the UserInfo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private ArrayList<LeaderBoardComponent> components = new ArrayList<LeaderBoardComponent>()  ;
    private String description ;
    public void act() 
    {
        // Add your action code here.
    }    
    public void printOnScreen() {
        
         for (LeaderBoardComponent obj  : components)
        {
            obj.printOnScreen();
        }
    
    }
    public void addChild(LeaderBoardComponent c) {
        components.add( c ) ;
    }
     
    public void removeChild(LeaderBoardComponent c) {
        components.remove(c) ;
    }
     
    public LeaderBoardComponent getChild(int i) {
        return components.get( i ) ;
    }
    
}

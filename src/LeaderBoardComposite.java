/**
 * Write a description of class LeaderBoardComposite here.
 * 
 * @author Jake
 * @version 1.0 - Apr 18
 */
import java.util.ArrayList;
import greenfoot.*;
public class LeaderBoardComposite extends LeaderBoardComponent
{
    // instance variables - replace the example below with your own
    private int x;

    private ArrayList<LeaderBoardComponent> components = new ArrayList<LeaderBoardComponent>()  ;
    private String description ;
    
    public LeaderBoardComposite ()
    { }

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
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}

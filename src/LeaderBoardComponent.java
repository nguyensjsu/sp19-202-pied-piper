import greenfoot.*;
/**
 * Write a description of class Component here.
 * 
 * @author Jake
 * @version 1.0 / Apr 19 2019
 */
public abstract class LeaderBoardComponent extends Actor 
{
     public abstract void printOnScreen() ;
     public abstract void addChild(LeaderBoardComponent c);
     public abstract void removeChild(LeaderBoardComponent c);
     public abstract LeaderBoardComponent getChild(int i);
}

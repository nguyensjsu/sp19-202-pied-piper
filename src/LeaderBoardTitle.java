import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Label here.
 * 
 * @author Jake
 * @version 1.0 / Apr 19 2019
 */
public class LeaderBoardTitle extends LeaderBoardComponent
{
    private String title="";
    private int posX;
    private int posY;
    
    public LeaderBoardTitle(String text, int x, int y)
    {
        title=text;
        posX=x;
        posY=y;
    }
    
    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    
    public void printOnScreen() {
    getWorld().showText(title, posX, posY);
    }
    
    public void addChild(LeaderBoardComponent c){}
    public void removeChild(LeaderBoardComponent c){}
    public LeaderBoardComponent getChild(int i){
        return null;
    }
}

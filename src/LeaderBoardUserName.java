import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LeaderBoardUserName here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class LeaderBoardUserName extends LeaderBoardComponent
{
    private String username="";
    private int posX;
    private int posY;
    public LeaderBoardUserName(String text, int x, int y)
    {
        username=text;
        posX=x;
        posY=y;
    //GreenfootImage img = new GreenfootImage(100,150);
    //img.drawString(text, 60, 60);
    //setImage (img);
    }
    /**
     * Act - do whatever the LeaderBoardUserName wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
      public void printOnScreen() {
        getWorld().showText(username, posX, posY);
    }
     
    public void addChild(LeaderBoardComponent c){}
    public void removeChild(LeaderBoardComponent c){}
    public LeaderBoardComponent getChild(int i){
        return null;
    }
    
}

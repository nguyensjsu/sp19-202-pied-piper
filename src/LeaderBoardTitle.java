import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Label here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LeaderBoardTitle extends LeaderBoardComponent
{
    
    public LeaderBoardTitle(String text)
    {
    GreenfootImage img = new GreenfootImage(100,150);
    img.drawString(text, 6, 60);
    System.out.println(text);
    setImage (img);
    }
    
    /**
     * Act - do whatever the Label wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    public void printDescription() {}
    public void addChild(LeaderBoardComponent c){}
    public void removeChild(LeaderBoardComponent c){}
     public LeaderBoardComponent getChild(int i){
        return null;
    }
}

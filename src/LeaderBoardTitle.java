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
    private String title2="";
    private int posX;
    private int posY;
    
    public LeaderBoardTitle(String text, String text2, int x, int y)
    {
        title=text;
        title2=text2;
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
        //Add snake mode description 
        Label l1 = new Label(title, 40, Color.WHITE);
        getWorld().addObject(l1, posX, posY);
        Label l2 = new Label(title2, 40, Color.WHITE);
        getWorld().addObject(l2, posX+152, posY);
    }
    
    public void addChild(LeaderBoardComponent c){}
    public void removeChild(LeaderBoardComponent c){}
    public LeaderBoardComponent getChild(int i){
        return null;
    }
}

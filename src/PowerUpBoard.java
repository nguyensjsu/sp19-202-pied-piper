import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


import java.util.ArrayList;
import java.util.List;
/**
     * Write a description of class FoodBoard here.
     * 
     * @author (HaoRan Chen) 
     * @version (4/19)
     */
public class PowerUpBoard extends Board implements ISubject
{
    /**
     * Act - do whatever the PowerUpBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private Number_Image number_image;
    private int count=0;
    List<Board> list= new ArrayList <Board>();
    public PowerUpBoard(){
     Color bgColor = new Color(0, 0, 0, 0);
     GreenfootImage bg=new GreenfootImage("speed:",40,Color.RED,bgColor);
     bg.scale(100,50);
     setImage(bg);
      
    }
    
    public void act() 
    {
        if(count==0){
        show(count);
        }
    }
    
    
    public void update(Item item){
     PowerUp powerup=(PowerUp)item;
        
     powerup.setCount(powerup.getCount()+1);
     
     if(powerup.getCount() == 5)
     {
        notifyObservers(item) ;
     }
    
     show(powerup.getCount());
    count++;
    } public void show(int count){
       
     Count_Number_Factory number_factory=new Count_Number_Factory();
     number_image=number_factory.makeImage(count);
     ArrayList list=number_image.getmyImage();
     GreenfootImage units=(GreenfootImage) list.get(0);
     GreenfootImage digits=(GreenfootImage)list.get(1);
     world=this.getWorld();
     
     unitsspace=new NumberSpace(units);
     unitsspace.set_the_Image();
     digitsspace=new NumberSpace(digits);
     digitsspace.set_the_Image();
     
     
    
     //world.addObject(digitsspace,50,50);
       world.addObject(unitsspace,390,70);
     world.addObject(digitsspace,340,70);
     
    }
    
    public void register(Board board)
    {
        list.add(board);
    }
    
    public void unregister(IObserver obj)
    {
    }
    
    public void notifyObservers(Item item)
    {
        AchievementBoard achievementBoard=(AchievementBoard)list.get(0);
        
        achievementBoard.update(item);
    }
    
    
}

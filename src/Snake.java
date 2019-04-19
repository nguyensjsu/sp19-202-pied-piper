import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor implements Subject
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int speed = 2;
    private Actor food;
    private Message m;
    private ArrayList<Observer> observers =  new ArrayList<Observer>();
    
    private int count = 0;
    
    public void act() 
    {
        m = (Message) getWorld().getObjects(Message.class).get(0);
        /**
         * Check if human is intersecting any object
        */
        checkForFood();
        
        move(speed);
        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
        }
        
        if(isTouching(PowerUp.class)){
            speed++;
        }  
        
        if(isAtEdge()){
            Greenfoot.playSound("Hiss.mp3");
            Greenfoot.stop();
        }
    }  
    
    public void checkForFood() 
    {
      food = getOneIntersectingObject(Food.class);
      if(food != null){
            
            notifyObservers("food", m); // check if snake intersects food and notify observers *Observer Pattern*
            getWorld().removeObject(food); // Snake eats the food, so food should disppear from the world
        }
    }
    
    public void calculateScore(){
        int score = 0;
        int food = ItemCollectionObserver.foodCount;
        int foodScore = food*5;
        StringBuilder s = new StringBuilder();
        
        s.append("Food Collected : "+food+" X 5 = "+foodScore+"\n");
        s.append("Total Score = "+(foodScore));
        //System.out.println(s.toString());
        m.setText(s.toString());
        m.setLocation(550, 350);
        if(ItemCollectionObserver.foodCount == 0){ // If number of food == 0, display "You Win" message! and stop the game.
                    calculateScore();
                    Greenfoot.stop();
                }
    }
    
    // OBSERVER PATTERN
    public void attach(Observer obj){
        observers.add(obj);
     }
   
    public void detach(Observer obj){
        observers.remove(obj);
     }
    
    public void notifyObservers(String item, Message m){
        for(Observer obj : observers)
        {
            obj.update(item, m);
        }
    }
}

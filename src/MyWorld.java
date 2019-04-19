import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Creator creator;
    Snake s1;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Snake(), 90, 90);
        Food food = new Food();
        addObject(food,527,125);
        PowerUp powerUp = new PowerUp();
        addObject(powerUp,371,199);
          
        Message m = new Message();
        addObject(m, 900, 60);
      
        addScoreBox(); // adds a score box at the top right
        populateFood(); // adds Food
        s1 = addSnakeToWorld(); // adds Snake to the world and returns a reference to attach the observers
        attachObservers(s1); // attaches itemCollectionObserver and soundObserver to the snake s1.
    
    }
    
    public void addScoreBox(){
        // adds a score box at the coordinates x = 900, y = 60
    }
    
    public Snake addSnakeToWorld(){
       s1 = new Snake();
       addObject(s1, 120, 420);
       return s1;
    }
    
    public void populateFood(){
       creator = new FoodFactory(); // This factory returns a Food
       
       addObject(creator.getActor(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(500));
       addObject(creator.getActor(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(500));
       addObject(creator.getActor(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(500));
    }
    
    public void attachObservers(Snake s1){
        s1.attach(new ItemCollectionObserver()); //attaching the ItemCollectionObserver
        s1.attach(new SoundObserver()); // attaching the SoundObserver
    }
}

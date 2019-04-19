import greenfoot.*;


public class ItemCollectionObserver implements Observer
{
    
    static int foodCount = 0;
    String foodString= "Food : 0";
    Creator creator;
    
    
    public ItemCollectionObserver()
    {
    }
    
    public void update(String item, Message m)
    {
       Snake s1 = (Snake) m.getWorld().getObjects(Snake.class).get(0);
       if(item=="food"){
            foodCount++;
            foodString = "Food : "+foodCount;
            if(foodCount%3 == 0){
                creator = new FoodFactory();
                m.getWorld().addObject(creator.getActor(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(500)); // Add food at random places.
                m.getWorld().addObject(creator.getActor(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(500));
                m.getWorld().addObject(creator.getActor(), Greenfoot.getRandomNumber(1000), Greenfoot.getRandomNumber(500));
            }
        }
        
        m.setText(foodString);
    }
        
        
        
}
    
    
    

    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    //import java.awt.*;
    import java.util.ArrayList;
    import java.util.List;
    
    /**
     * Write a description of class FoodBoard here.
     * 
     * @author (HaoRan Chen) 
     * @version (4/19)
     */
    public class FoodBoard extends Board implements ISubject
    {
        /**
         * Act - do whatever the FoodBoard wants to do. This method is called whenever
         * the 'Act' or 'Run' button gets pressed in the environment.
         */
        private Number_Image number_image;
        
       
        private Message message1;
        
        List<Board> list=new ArrayList<Board>();
        
        public FoodBoard(){
               
        Color bgColor = new Color(0, 0, 0, 0);
        GreenfootImage bg=new GreenfootImage("Food:",40,Color.RED,bgColor);
        bg.scale(100,50);
        setImage(bg);
        
       
    }
    
    public void act() 
    {
        // Add your action code here.
        
        
    }
    public void update(Item item){
      Food food=(Food)item;
        
     food.setCount(food.getCount()+1);
     
     if(food.getCount() == 5)
     {
         notifyObservers(item);
     }
     
     show(food.getCount());
    }
    public void show(int count){
        
     Count_Number_Factory number_factory=new Count_Number_Factory();
     number_image=number_factory.makeImage(count);
     ArrayList list=number_image.getmyImage();
     GreenfootImage units=(GreenfootImage) list.get(0);
     GreenfootImage digits=(GreenfootImage)list.get(1);
     
     unitsspace=new NumberSpace(units);
     unitsspace.set_the_Image();
     digitsspace=new NumberSpace(digits);
     digitsspace.set_the_Image();
     
     world=this.getWorld();
     //world.addObject(digitsspace,50,50);
    
     world.addObject(unitsspace,75,70);
     world.addObject(digitsspace,25,70);
     
     //message1 = new Message("Congratulations you won 10 bonus points", 350, 80);
     
     //world.addObject(message1, 1000, 20);
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

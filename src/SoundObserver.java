import greenfoot.*;


public class SoundObserver implements Observer
{
    
    public SoundObserver()
    {
    }
    
    public void update(String item, Message m)
    {
        
        if(item=="food"){
            //play(sound)
            Greenfoot.playSound("Eat.mp3");
        }
        
        
    }
        
        
        
}
    
    
    

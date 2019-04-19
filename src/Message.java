import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Message extends Actor
{
    GreenfootImage gi;
    
    public Message(){
        gi = new GreenfootImage(350, 120); // create a new greenfoot image of size width = 350, height = 120
        gi.clear();
        gi.setColor(Color.BLACK);
        gi.setFont(new Font(true, true, 16));
        gi.drawString("Food: 0", 10, 30); // Initialize the message with zero food, kits etc.
        setImage(gi);
    }
    
    public void act() 
    {
    }
    
    public void setText(String msg){ // updates the message passed into it in the score box
        gi.clear();
        gi.setColor(Color.BLACK);
        gi.setFont(new Font(true, true, 16));
        gi.drawString(msg, 10, 30);
    }
}

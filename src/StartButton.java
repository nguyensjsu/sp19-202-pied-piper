import greenfoot.*;

public class StartButton extends Actor
{   
    private GreenfootImage buttonImage;

    public StartButton(){
        buttonImage = new GreenfootImage("startbutton.png");
        buttonImage.scale(80,50);
        setImage(buttonImage);
    }
    
}
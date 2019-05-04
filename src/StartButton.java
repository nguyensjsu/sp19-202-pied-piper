import greenfoot.*;

public class StartButton extends Actor
{   
    private GreenfootImage buttonImage;

    public StartButton(){
        buttonImage = new GreenfootImage("startbutton.png");
        buttonImage.scale(120,50);
        setImage(buttonImage);
    }
    
}
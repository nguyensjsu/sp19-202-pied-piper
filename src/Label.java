import greenfoot.*;
//import java.awt.Color;
 
public class Label extends Actor
{
    public Label(String text, int fontSize, Color fontColor)
    {
        // create the text image
        //int fontsize = 24; // change as desired
        //Color fontColor = Color.BLACK; // change as desired
        Color bgColor = new Color(0, 0, 0, 0); // transparent background
        GreenfootImage txtImg = new GreenfootImage(text, fontSize, fontColor, bgColor);
        // create the base image
        GreenfootImage img = new GreenfootImage(200, 200);
        //bgColor = Color.WHITE; // change as desired
        img.setColor(bgColor);
        img.fill();
        // draw text image on base image
        img.drawImage(txtImg, 10, 5);
        setImage(img);
    }
     
    public void act() 
    {
    }    
}
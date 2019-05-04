import greenfoot.*;
/**
 * Write a description of class RedMenuSnake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedMenuSnake extends Actor implements IMenuSnakeDecorator  
{
    private GreenfootImage snakeImage;
    /**
     * Constructor for objects of class RedMenuSnake
     */
    public RedMenuSnake()
    {
        snakeImage = getImg();
        setImage(snakeImage);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    @Override
    public GreenfootImage getImg()
    {
        snakeImage = new GreenfootImage("redSnake.png");
        snakeImage.scale(150,150);
        return snakeImage;       
    }
}

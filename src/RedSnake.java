import greenfoot.*;

public class RedSnake extends Actor
{	
	private GreenfootImage snakeImage;

	public RedSnake(){
        snakeImage = new GreenfootImage(30, 50);
        snakeImage.setColor(Color.RED);
        snakeImage.fill();
        setImage(snakeImage);
    }
	
}
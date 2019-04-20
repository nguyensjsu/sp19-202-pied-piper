import greenfoot.*;

public class BlueSnake extends Actor
{	
	private GreenfootImage snakeImage;

	public BlueSnake(){
        snakeImage = new GreenfootImage(30, 50);
        snakeImage.setColor(Color.BLUE);
        snakeImage.fill();
        setImage(snakeImage);
    }
	
}
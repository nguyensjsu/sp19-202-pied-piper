import greenfoot.*;

public class GreenSnake extends Actor
{	
	private GreenfootImage snakeImage;

	public GreenSnake(){
		snakeImage = new GreenfootImage("greenSnake.png");
        snakeImage.scale(150,150);
        setImage(snakeImage);
        // snakeImage = new GreenfootImage(30, 50);
        // snakeImage.setColor(Color.GREEN);
        // snakeImage.fill();
        // setImage(snakeImage);
    }
	
}
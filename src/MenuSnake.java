import greenfoot.*;

public class MenuSnake extends Actor implements IMenuSnake 
{   
    private GreenfootImage snakeImage;
    private IMenuSnakeDecorator smDecorator;

    public MenuSnake(){
    }
    
    public GreenfootImage getImg()
    {
        if (this.smDecorator ==null)
        {
        snakeImage = new GreenfootImage("greenSnake.png");
        snakeImage.scale(150,150);
        setImage(snakeImage);   
        return snakeImage;
        } else {
        snakeImage = this.smDecorator.getImg();
        snakeImage.scale(150,150);               
        return this.smDecorator.getImg(); 
       }
          
    } 

    public void displaySnake() {
        setImage(getImg());
    }

    public void wrapSnakeMenuDecorator(IMenuSnakeDecorator sd) {
        this.smDecorator = sd;
    }   
}
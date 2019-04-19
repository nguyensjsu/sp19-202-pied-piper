import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    //int speed = 2;
    private int speed;
    private ISpeedDecorator speedDecorator;
    private IColorDecorator colorDecorator;
    private int snakeLength;
    private Color snakeColor;
    private GreenfootImage snakeImage;

    public Snake(){
        speed = 1;
        snakeLength = 20;
        snakeColor = Color.GREEN;
        snakeImage = new GreenfootImage(snakeLength, snakeLength);
        snakeImage.setColor(snakeColor);
        snakeImage.fill();
        setImage(snakeImage);
    }

    public void wrapSpeedDecorator(ISpeedDecorator sd) {
        this.speedDecorator = sd;
    }
    
    public void wrapColorDecorator(IColorDecorator cd) {
        this.colorDecorator = cd;
    }

    
    public void act() 
    {
        move(speed);
        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(180);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(270);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
        }
        
        if(isTouching(PowerUp.class)){
            //speed++;
            speed = speedDecorator.increaseSpeed(speed);
        } 
        // add length when snake eats apple
        if (isTouching(Food.class)) {
            snakeLength += 50;
            snakeImage = new GreenfootImage(snakeLength, 20);
            snakeColor = colorDecorator.changeColor(snakeLength);
            snakeImage.setColor(snakeColor);
            snakeImage.fill();
            setImage(snakeImage);
        } 
        
        if(isAtEdge()){
            Greenfoot.playSound("Hiss.mp3");
            Greenfoot.stop();
        }
    }    
}

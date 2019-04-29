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
    private int snakeSpeed;
    private ISnakeDecorator snakeDecorator;
    private int snakeLength;
    private Color snakeColor;
    private GreenfootImage snakeImage;
    public int timer = 0; // Snake moves a unit (50 px) every 50 ticks

    private int updateSpeed;
    private int snakeLife;
    
    private int foodEaten;

    public Snake(){
        updateSpeed = 0;
        foodEaten = 0;    
    }

    public void wrapSnakeDecorator(ISnakeDecorator sd) {
        this.snakeDecorator = sd;
    }
    //private Tail start;
    // setup snake images
    public void prepare() {
        snakeColor = snakeDecorator.defaultColor();
        snakeSpeed = snakeDecorator.defaultSpeed();
        snakeLife = snakeDecorator.defaultLifeSpan();
        snakeImage = new GreenfootImage(50, 50);
        snakeImage.setColor(snakeColor);
        snakeImage.fill();
        setImage(snakeImage);
        addBeginningTail(snakeLife);

    }

    public void addBeginningTail(int life) {
        if (life == 50) {
            //start = new Tail(snakeColor, snakeLife);
            getWorld().addObject(new Tail(snakeColor, life), getX()-50, getY());
        } else if (life == 150) {
            getWorld().addObject(new Tail(snakeColor, life), getX()-50, getY());
            getWorld().addObject(new Tail(snakeColor, life), getX()-100, getY());
        }
        
    }

    private int growingFactor;

    public void act() 
    { 
        /** Update speed when touches power up class
        **/
        if (updateSpeed != 0) {
            timer += updateSpeed;
        } else timer += snakeSpeed;

         // Timer increments based on speed value
        if (timer >= 50){ 
            if (updateSpeed != 0) {
                growingFactor = (timer/updateSpeed) * foodEaten;
            } else growingFactor = (timer/snakeSpeed) * foodEaten;

            getWorld().addObject(new Tail(snakeColor, growingFactor), getX(), getY());
            move(50); // When timer hits 50, move 1 unit and reset timer
            timer = 0;
        }

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
             /* 
                Increase speed when touches power up
             */
             if (updateSpeed != 0) {
                updateSpeed = snakeDecorator.increaseSpeed(updateSpeed);
             } else updateSpeed = snakeDecorator.increaseSpeed(snakeSpeed);
    
        }         

        if (isTouching(Food.class)) {
            foodEaten++;
        } 
            
          
        
        if(isAtEdge()){
            Greenfoot.playSound("Hiss.mp3");
            Greenfoot.stop();
            Greenfoot.setWorld(new LeaderBoardScreen());
        }
    } 
}

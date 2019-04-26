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

    private int updateSpeed;

    public Snake(){
        updateSpeed = 0;
    }

    public void wrapSnakeDecorator(ISnakeDecorator sd) {
        this.snakeDecorator = sd;
    }

    // setup snake images
    private void prepare() {
        snakeColor = snakeDecorator.defaultColor();
        int[] defaultLength = snakeDecorator.defaultLength();
        snakeSpeed = snakeDecorator.defaultSpeed();

        snakeImage = new GreenfootImage(defaultLength[0], defaultLength[1]);
        snakeImage.setColor(snakeColor);
        snakeImage.fill();
        setImage(snakeImage);
    }

    
//     public void act() 
//     {   
//         prepare(); 

//         if (updateSpeed != 0) {
//             move(updateSpeed);
//         } else move(snakeSpeed);
    //public int timer = 0; // Snake moves a unit (50 px) every 50 ticks
    //public int speed = 2; // Speed multiplier for ticks
    
//     public Snake(){
//         GreenfootImage snakeImage = new GreenfootImage(50,50);
//         snakeImage.fill();
//         setImage(snakeImage);
//     }
    
    public void act() 
    { 
        prepare();
        // timer += speed; // Timer increments based on speed value
        // if (timer >= 50){ 
        //     move(50); // When timer hits 50, move 1 unit and reset timer
        //     timer = 0;
        // }
         if (updateSpeed != 0) {
             move(updateSpeed);
         } else move(snakeSpeed);

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
             updateSpeed += snakeDecorator.increaseSpeed(snakeSpeed); 
        }         
//         } 
//         // add length when snake eats apple
//         if (isTouching(Food.class)) {

//         } 
            //speed++;
          
        
        if(isAtEdge()){
            Greenfoot.playSound("Hiss.mp3");
            Greenfoot.stop();
            Greenfoot.setWorld(new LeaderBoardScreen());
        }
    }    
}

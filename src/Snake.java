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
         * Add snake attribute, 
         */
        private int snakeSpeed;
        private ISnakeDecorator snakeDecorator;
        private Color snakeColor;
        private int snakeLife; 
        private GreenfootImage snakeImage;
        private boolean dead = false;

        /**
        **  Set up animation attribute
        **/
        public int timer = 0; // Snake moves a unit (50 px) every 50 ticks
        private int updateSpeed = 0;     
        private int foodEaten = 0;

        /** Added Builder Design Pattern for constructing snake details
        **/
        public static class Builder {
            private int snakeSpeed;
            private int snakeLife;
            private ISnakeDecorator snakeDecorator;
            private Color snakeColor;
            private GreenfootImage snakeImage;

            public Builder(ISnakeDecorator snakeDecorator) {
                this.snakeDecorator = snakeDecorator;
            }
            public Builder snakeColor(){
                this.snakeColor = snakeDecorator.defaultColor();
                return this;  //By returning the builder each time, we can create a fluent interface.
            }
            public Builder snakeSpeed(){
                this.snakeSpeed = snakeDecorator.defaultSpeed();
                return this;  //By returning the builder each time, we can create a fluent interface.
            }
            public Builder snakeLife(){
                this.snakeLife = snakeDecorator.defaultLifeSpan();
                return this;
            }
            public Builder snakeImage(){
                this.snakeImage = new GreenfootImage(50, 50);
                this.snakeImage.setColor(this.snakeColor);
                this.snakeImage.fill();
                return this;
            }
            
            public Snake build(){
                //Here we create the actual snake object, which is always in a fully initialised state when it's returned.
                Snake snake = new Snake();  //Since the builder is in the Snake class, we can invoke its private constructor.
                snake.snakeDecorator = this.snakeDecorator;
                snake.snakeSpeed = this.snakeSpeed;
                snake.snakeColor = this.snakeColor;
                snake.snakeLife = this.snakeLife;
                snake.snakeImage = this.snakeImage;
                return snake;
            }
        }

    // public Snake() {
    //     //snakeSpeed = this.snakeSpeed;
    //     //snakeColor = this.snakeColor;
    //     //snakeLife = this.snakeLife;
    // }
    
    public void wrapSnakeDecorator(ISnakeDecorator sd) {
        this.snakeDecorator = sd;
    }

    // add snake images to myworld
    public void prepare() {        
        setImage(snakeImage);               
    }
        
    public void additionalTail(Color c, int f) {
        getWorld().addObject(new Tail(c, growingFactor+50), getX(), getY());

        // Adds a tail which lasts an extra revolution
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

            if (snakeColor == Color.GREEN){
                additionalTail(snakeColor, growingFactor); // Green snake begins with initial extra tail         
            }            
                        
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
                     
        if (!dead){
            if (isTouching(Tail.class)) {
                death();
            }
            
            else if(isAtEdge()){
                death();
            }
        }
    }
    
    public void death(){
        dead = true;
        Greenfoot.playSound("Hiss.mp3");
        Greenfoot.stop();
        Greenfoot.setWorld(new LeaderBoardScreen());      
    }
    
}

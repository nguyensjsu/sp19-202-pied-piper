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

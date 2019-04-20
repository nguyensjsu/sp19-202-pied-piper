import greenfoot.*;  
/**
 * Snake Speed decorator 
 * 
 * @author Yueqiao Zhang 
 * @version 4/19
 */
public class RedSnakeDecorator implements ISnakeDecorator
{
    /**
     * snake speed decorator
     */
    public Color changeColor() {
    	return Color.RED;
    }

    public int changeSpeed() {
    	return 3;
    }

    public int changeLength() {
    	return 10;
    }

    public int increaseSpeed(int speed) {
        return speed + 2;
    }
}

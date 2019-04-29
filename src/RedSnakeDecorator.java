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
    public Color defaultColor() {
    	return Color.RED;
    }

    public int defaultSpeed() {
    	return 5;
    }

    public int defaultLifeSpan() {
       return 1;
    }

    public int increaseSpeed(int speed) {
        return speed + 2;
    }
}

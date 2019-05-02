import greenfoot.*;  
/**
 * Snake Speed decorator 
 * 
 * @author Yueqiao Zhang 
 * @version 4/18
 */
public class GreenSnakeDecorator implements ISnakeDecorator
{
    /**
     * snake speed decorator
     */
    public Color defaultColor() {
    	return Color.GREEN;
    }

    public int defaultSpeed() {
    	return 2;
    }

    public int defaultLifeSpan() {
        return 1;
    }

    public int increaseSpeed(int speed) {
        return speed + 1;
    }
}

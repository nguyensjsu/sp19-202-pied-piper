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
    	return 3;
    }

    public int[] defaultLength() {
        int[] result = new int[2];
        result[0] = 50;
        result[1] = 50;
    	return result;
    }

    public int increaseSpeed(int speed) {
        return speed + 2;
    }
}

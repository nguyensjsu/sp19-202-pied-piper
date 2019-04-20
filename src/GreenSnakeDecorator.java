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

    public int[] defaultLength() {
        int[] result = new int[2];
        result[0] = 40;
        result[1] = 20;
        return result;
    }

    public int increaseSpeed(int speed) {
        return speed + 2;
    }
}

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
    public Color changeColor() {
    	return Color.GREEN;
    }

    public int changeSpeed() {
    	return 2;
    }

    public int changeLength() {
    	return 20;
    }

    public int increaseSpeed(int speed) {
        return speed + 2;
    }
}

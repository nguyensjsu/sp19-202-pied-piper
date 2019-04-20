import greenfoot.*;  
/**
 * Snake Speed decorator 
 * 
 * @author Yueqiao Zhang 
 * @version 4/18
 */
public class BlueSnakeDecorator implements ISnakeDecorator
{
    /**
     * snake speed decorator
     */
    public Color changeColor() {
    	return Color.BLUE;
    }

    public int changeSpeed() {
    	return 1;
    }

    public int changeLength() {
    	return 50;
    }
    
    public int increaseSpeed(int speed) {
        return speed + 2;
    }
}

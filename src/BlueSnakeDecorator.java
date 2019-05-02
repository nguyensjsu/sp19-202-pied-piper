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
    public Color defaultColor() {
    	return Color.BLUE;
    }

    public int defaultSpeed() {
    	return 20;
    }

    public int defaultLifeSpan() {
        return 150;
    }
    
    public int increaseSpeed(int speed) {
        return speed - 1;
    }

 
    
}

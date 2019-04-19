import greenfoot.*;  
/**
 * Snake Speed decorator 
 * 
 * @author Yueqiao Zhang 
 * @version 4/18
 */
public class SpeedDecorator implements ISpeedDecorator
{
    /**
     * snake speed decorator
     */
    public int increaseSpeed(int speed) {
        return speed += 5; 
    }

    public int decreaseSpeed(int speed) {
        return speed--;
    }
}

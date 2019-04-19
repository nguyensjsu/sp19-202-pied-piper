import greenfoot.*; 

/**
 * interface class for snake speed change decorator
 * 
 * @author Yueqiao Zhang
 * @version 04/17
 */
public interface ISpeedDecorator
{
      int increaseSpeed(int speed);
      int decreaseSpeed(int speed);
}

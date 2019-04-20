import greenfoot.*; 

/**
 * interface class for snake speed change decorator
 * 
 * @author Yueqiao Zhang
 * @version 04/17
 */
public interface ISnakeDecorator
{
      Color defaultColor();
      int defaultSpeed();
      int[] defaultLength();
      int increaseSpeed(int speed);
}
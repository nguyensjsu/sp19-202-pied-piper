import greenfoot.*; 

/**
 * interface class for snake speed change decorator
 * 
 * @author Yueqiao Zhang
 * @version 04/17
 */
public interface ISnakeDecorator
{
      Color changeColor();
      int changeSpeed();
      int changeLength();
      int increaseSpeed(int speed);
}
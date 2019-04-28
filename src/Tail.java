import greenfoot.*;  
/**
 * Snake Speed decorator 
 * 
 * @author Yueqiao Zhang 
 * @version 4/19
 */
public class Tail extends Actor
{
    private int age = 0;
    private int lifeSpan = 100;

    public Tail() {
        GreenfootImage img = new GreenfootImage(50, 50);
        img.setColor(Color.GREEN);
        img.fill();
        setImage(img);
    }

    public void act() {
        age++;
        if (age == lifeSpan) {
            getWorld().removeObject(this);
        }
    }
}

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
    private int lifeSpan;

    public Tail(Color color, int lifeSpan) {
        GreenfootImage img = new GreenfootImage(50, 50);
        img.setColor(color);
        img.fill();
        setImage(img);
        this.lifeSpan = lifeSpan;
    }

    public void act() {
        
        if (age == lifeSpan) {
            getWorld().removeObject(this);
        }
        age++;
    }
}

import greenfoot.*;  
/**
 * Snake Speed decorator 
 * 
 * @author Yueqiao Zhang 
 * @version 4/19
 */
public class ColorDecorator implements IColorDecorator
{
    /**
     * snake color decorator
     */
    public Color changeColor(int length) {
        if (length > 100) return Color.MAGENTA;
        else if (length > 200) return Color.RED;
        else return Color.GREEN;
    }

}

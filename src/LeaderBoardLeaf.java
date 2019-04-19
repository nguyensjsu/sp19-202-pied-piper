/**
 * Write a description of class LeaderBoardLeaf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.text.DecimalFormat;
public class LeaderBoardLeaf implements LeaderBoardComponent   
{
    // instance variables - replace the example below with your own
    private int x;

        private String description ;
    private Double price ;

    public LeaderBoardLeaf ( String d, Double p )
    {
        description = d ;
        price = p ;
    }
    
    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( description + " " + fmt.format(price) ) ;
    }

    public void addChild(LeaderBoardComponent c) {
	    // no implementation
	}

	public void removeChild(LeaderBoardComponent c) {
        // no implementation
	}

	public LeaderBoardComponent getChild(int i) {
        // no implementation
        return null ;
	}

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}

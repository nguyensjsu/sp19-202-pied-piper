import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class PowerUp here.
 * 
 * @author (Half HaoRan Chen) 
 * @version (4/19)
 */
public class PowerUp extends Item 
{
    /**
     * Act - do whatever the PowerUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    List<Board> list=new ArrayList<Board>();
    public void act() 
    {
        if(isTouching(Snake.class)){
            Greenfoot.playSound("PowerUp.mp3");
            mynotify();
        }  
        super.act();
    }
    public void attach(Board board){list.add(board);};
    public void remove(){}

    //@Override
    public void mynotify() {

        for (int i=0;i<list.size();i++){
            if (list.get(i) instanceof PowerUpBoard){
                PowerUpBoard powerupboard=(PowerUpBoard) list.get(i);
                powerupboard.update(this);

            }
            else if (list.get(i) instanceof ScoreBoard){
                ScoreBoard scoreBoard=(ScoreBoard) list.get(i);
                scoreBoard.update(this);
            }
        }

    }

}

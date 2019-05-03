import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Food here.
 * 
 * @author (half HaoRan Chne) 
 * @version (4/19)
 */
public class Food extends Item
{
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    List<Board> list=new ArrayList<Board>();
    public void act() 
    {
        if(isTouching(Snake.class)){
            Greenfoot.playSound("Eat.mp3");
            mynotify();
        }  
        super.act();
    }
    public void attach(Board board){
        list.add(board);
    };
    public void remove(){};
    public void mynotify(){
        for (int i=0;i<list.size();i++){
            if (list.get(i) instanceof FoodBoard){
                FoodBoard foodBoard=(FoodBoard) list.get(i);
                foodBoard.update(this);
            }
            else if (list.get(i) instanceof ScoreBoard){
                ScoreBoard scoreBoard=(ScoreBoard) list.get(i);
                scoreBoard.update(this);
            }
        }


    };
}

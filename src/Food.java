import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Food extends Item implements Subject
{
    //protected  int count;
    List<Board> list= new ArrayList <Board>();
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
                  foodBoard.update();
              }
              else if (list.get(i) instanceof ScoreBoard){
                  ScoreBoard scoreBoard=(ScoreBoard) list.get(i);
                  scoreBoard.update();
              }
          }

     
    };
}

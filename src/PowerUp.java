import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class PowerUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUp extends Item implements Subject
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
        }  
        super.act();
    }    
    public void attach(Board board){list.add(board);};
    public void remove(){}

    @Override
    public void mynotify() {
        for (int i=0;i<list.size();i++){
            list.get(i).update(this);
        }
    }

    ;

}

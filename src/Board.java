import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Board here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Board extends Actor implements Observer
{
    /**
     * Act - do whatever the Board wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    protected int boardlength=0;
    protected int boardwidth=0;
    protected World world;
    protected NumberSpace unitsspace;
    protected NumberSpace digitsspace;
   
    
    public  Board(){
    
    }
    public void show(int count){}
    public void update(Item item){}

    public int getBoardlength() {
        return boardlength;
    }

    public int getBoardwidth() {
        return boardwidth;
    }

 

    public void setBoardlength(int boardlength) {
        this.boardlength = boardlength;
    }

    public void setBoardwidth(int boardwidth) {
        this.boardwidth = boardwidth;
    }

   
    
}

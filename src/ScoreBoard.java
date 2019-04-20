import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Board
{
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int foodcount=0;
    int powerupcount=0;
    int score=0;
    public void act() 
    {
        // Add your action code here.
    }

    @Override
    public void update() {
         

    }
    public int getscore(){

        return score;
    }

}

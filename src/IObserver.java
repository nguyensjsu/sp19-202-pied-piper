import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public interface IObserver {
     
    //method to update the observer, used by subject
    public void update(Item item);
     
}
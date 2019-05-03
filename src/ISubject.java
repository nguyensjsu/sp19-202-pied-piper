import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public interface ISubject {
 
    //methods to register and unregister observers
    public void register(Board board);
    public void unregister(IObserver obj);
     
    //method to notify observers of change
    public void notifyObservers(Item item);
    
}
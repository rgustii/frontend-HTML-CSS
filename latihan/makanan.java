import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class makanan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class makanan extends Actor
{
    /**
     * Act - do whatever the makanan wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    
    public void jatuh(){
        setLocation(getX()-3, getY());
    }
    public void remove(){
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
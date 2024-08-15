import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class p here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class p extends Actor
{
 /**
     * Act - do whatever the p wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        gerak();
        tambahobjek();
    }
     public void gerak()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-5);
        }
        else if(Greenfoot.isKeyDown("right")){
            move(5);
        }
        else if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY()-5);
        }
        else if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY()+5);
        }
    }
    
    public void tambahobjek(){
        if(Greenfoot.getRandomNumber(100)==50) {
            getWorld().addObject(new makanan2(),0,Greenfoot.getRandomNumber(1200));
        }else if (Greenfoot.getRandomNumber(100)==50) {
            getWorld().addObject(new makanan3(),0,Greenfoot.getRandomNumber(1200));
        }else if (Greenfoot.getRandomNumber(100)==250){
            getWorld().addObject(new makanan3(),0,Greenfoot.getRandomNumber(1200));
        }
        
    }
}

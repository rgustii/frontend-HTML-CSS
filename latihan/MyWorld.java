import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 500, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        p p = new p();
        addObject(p,157,305);
        p.setLocation(162,286);
        p.setLocation(339,175);
        makanan2 makanan2 = new makanan2();
        addObject(makanan2,383,97);
        makanan3 makanan3 = new makanan3();
        addObject(makanan3,275,74);
        p.setLocation(147,210);
    }
}

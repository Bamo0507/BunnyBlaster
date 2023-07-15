import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Carrot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Carrot extends Actor
{
    /**
     * Act - do whatever the Carrot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Carrot(){
        GreenfootImage img = new GreenfootImage("Carrot.png");
        img.scale(img.getWidth() / 12, img.getHeight() / 12);
        img.rotate(-180);
        setImage(img);
    }
}
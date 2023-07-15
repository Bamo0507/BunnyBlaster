import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rabbit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rabbit extends Actor
{
    private int velocidad;
    public void act()
    {
        // Add your action code here.
        moverRabbit();
    }
    public Rabbit() {
        GreenfootImage img = new GreenfootImage("Rabbit.png");
        img.scale(img.getWidth() / 12, img.getHeight() / 12);
        setImage(img);
        velocidad = 4;
    }
    
    private void moverRabbit() {
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - velocidad);
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + velocidad);
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - velocidad, getY());
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + velocidad, getY());
        }
    }
}

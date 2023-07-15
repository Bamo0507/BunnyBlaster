import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Forest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Forest extends World
{

    /**
     * Constructor for objects of class Forest.
     * 
     */
    public Forest()
    {    
        super(640, 360, 1); 
        inicio();
    }
    
    public void inicio() {
        Rabbit conejo = new Rabbit();
        addObject(conejo, getWidth()/2, getHeight()/2);
    }
    
    private void generarComida() {
        if (Greenfoot.getRandomNumber(100) < 2) {
            Comida food = new Comida();
            int x = Greenfoot.getRandomNumber(getWidth() - 100) + 50;
            addObject(food, x, 0);
        }
    }
}

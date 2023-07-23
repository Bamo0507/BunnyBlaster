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
        int minimo = 2;
        int maximo = 4;
        int rand = Greenfoot.getRandomNumber(maximo - minimo +1) + minimo;
        burguer[] comidas1 = new burguer[rand];
        for(int i=0; i<comidas1.length; i++){
            comidas1[i] = new burguer();
            int comidaX = Greenfoot.getRandomNumber(getWidth());
            int comidaY = Greenfoot.getRandomNumber(getHeight());
            addObject(comidas1[i], comidaX, comidaY);
        }
        
        donut[] comidas2 = new donut[rand];
        for(int i=0; i<comidas2.length; i++){
            comidas2[i] = new donut();
            int comidaX = Greenfoot.getRandomNumber(getWidth());
            int comidaY = Greenfoot.getRandomNumber(getHeight());
            addObject(comidas2[i], comidaX, comidaY);
        }
        
        fries[] comidas3 = new fries[rand];
        for(int i=0; i<comidas3.length; i++){
            comidas3[i] = new fries();
            int comidaX = Greenfoot.getRandomNumber(getWidth());
            int comidaY = Greenfoot.getRandomNumber(getHeight());
            addObject(comidas3[i], comidaX, comidaY);
        }
        
        apple[] comidas4 = new apple[rand];
        for(int i=0; i<comidas4.length; i++){
            comidas4[i] = new apple();
            int comidaX = Greenfoot.getRandomNumber(getWidth());
            int comidaY = Greenfoot.getRandomNumber(getHeight());
            addObject(comidas4[i], comidaX, comidaY);
        }
        
        cherry[] comidas5 = new cherry[rand];
        for(int i=0; i<comidas5.length; i++){
            comidas5[i] = new cherry();
            int comidaX = Greenfoot.getRandomNumber(getWidth());
            int comidaY = Greenfoot.getRandomNumber(getHeight());
            addObject(comidas5[i], comidaX, comidaY);
        }
        
        mora[] comidas6 = new mora[rand];
        for(int i=0; i<comidas6.length; i++){
            comidas6[i] = new mora();
            int comidaX = Greenfoot.getRandomNumber(getWidth());
            int comidaY = Greenfoot.getRandomNumber(getHeight());
            addObject(comidas6[i], comidaX, comidaY);
        }
    }

}

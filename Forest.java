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
        prepare();
    }

    public void inicio() {
        Rabbit conejo = new Rabbit();
        addObject(conejo, getWidth()/2, getHeight()/2);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    //ELIMINAR TODA ESTA SECCIÓN, SOLO ES PARA QUE PRUEBE ADRIANA
    private void prepare()
    {
        Comida comida = new Comida();
        addObject(comida,78,37);
        Comida comida2 = new Comida();
        addObject(comida2,184,176);
        Comida comida3 = new Comida();
        addObject(comida3,95,306);
        Comida comida4 = new Comida();
        addObject(comida4,483,58);
        Comida comida5 = new Comida();
        addObject(comida5,552,272);
        Comida comida6 = new Comida();
        addObject(comida6,278,68);
        Comida comida7 = new Comida();
        addObject(comida7,376,268);
        Comida comida8 = new Comida();
        addObject(comida8,619,164);
        Comida comida9 = new Comida();
        addObject(comida9,238,287);
        Comida comida10 = new Comida();
        addObject(comida10,95,150);
    }
}

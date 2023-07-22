import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Comida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Comida extends Actor
{
    protected int velocidad=5;
    private double dx=0;
    private int y=0;
    private int amplitud=10;
    
    public void act()
    {
        mover();
        comprobarBordes();
    }
    
    private void mover(){
        movimientoSenodal();
        setLocation(getX()+velocidad, getY()+y);
        
    }
    
    protected void comprobarBordes(){
        if (getX()==getWorld().getWidth()-1){
            setLocation(0,getY());
        }
    }
    private void movimientoSenodal(){
        dx=dx+0.1;
        double dy=Math.sin(dx);
        y=(int) (dy*amplitud);
    }}


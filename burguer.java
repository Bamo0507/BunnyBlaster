import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class burguer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class burguer extends Junkfood
{
    
    public burguer(){
        velocidad=3;
    }
    
    public void act()
    {
        super.act();
    }
    @Override
    protected void comprobarBordes(){
        if (getX()==getWorld().getWidth()-1|| getX()==0){
            getImage().mirrorHorizontally();
            velocidad=-velocidad;
        }
    }
}

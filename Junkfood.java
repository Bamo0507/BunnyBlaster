import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Junkfood here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Junkfood extends Comida
{
    
    public void act()
    {
         super.act();
    }
    
    @Override
    protected void comprobarBordes(){
        if (getX()==getWorld().getWidth()-1){
            int nuevaY=Greenfoot.getRandomNumber(getWorld().getHeight());
            setLocation(0,getY());
        }
    }
}

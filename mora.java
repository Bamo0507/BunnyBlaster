import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mora extends healthy
{
    public mora(){
        velocidad=3;
        GreenfootImage img = new GreenfootImage("Imagen3.png");
        img.scale(img.getWidth() / 2, img.getHeight() / 2);
        setImage(img);

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

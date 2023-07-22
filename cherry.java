import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cherry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cherry extends healthy
{
    public cherry(){
        velocidad=3;
        GreenfootImage img = new GreenfootImage("cherry.png");
        img.scale(img.getWidth() / 1, img.getHeight() / 1);
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

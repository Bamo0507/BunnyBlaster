import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

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
    private int velocidadx;
    private int velocidady;
    private int vel;
    private Comida[] comidas = {new burguer(), new donut(), new fries(), new apple(), new cherry(), new mora()};
    
    public void act(){
        setLocation(getX() + velocidadx, getY() + velocidady);
        
        Comida f = (Comida)getOneIntersectingObject(Comida.class);

        if (getX() <= 0 || getX() >= getWorld().getWidth() - 1 || getY() <= 0 || getY() >= getWorld().getHeight() - 1) {
            eliminar(); // Eliminar el objeto
        }
        else if(f != null){
            getWorld().removeObject(f);
            removeTouching(Comida.class);
                   
            Forest mundo = (Forest) getWorld();
            mundo.conteoPuntos += 50;
            
            eliminar();    
            
            
            Random random = new Random();
            int randomIndex = random.nextInt(comidas.length);
            
            Comida nuevaComida = comidas[randomIndex];
            
            int x = Greenfoot.getRandomNumber(mundo.getWidth());
            int y = Greenfoot.getRandomNumber(mundo.getHeight());
            mundo.addObject(nuevaComida, x, y);
            // AQUÍ SE COLOCARÁ EL SONIDO CUANDO SE DESTRUYA ALGO 
            
        }
    }
     
    public void setVelocity(int vx, int vy) {
        vel = 2;
        velocidadx = vx * vel;
        velocidady = vy * vel;
    }
    
    public Carrot(){
        GreenfootImage img = new GreenfootImage("Carrot.png");
        img.scale(img.getWidth() / 12, img.getHeight() / 12);
        img.rotate(-180);
        setImage(img);
    }
    
    private void eliminar(){
        getWorld().removeObject(this);
    }
    
    
}
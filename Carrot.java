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
    public int vel = 2;
    private int x;
    private int y;
    
    
    
    
    private Comida[] comidas = {new burguer(), new donut(), new fries(), new apple(), new cherry(), new mora()};
    
    public void act(){
        GreenfootImage img = new GreenfootImage("Carrot.png");
        img.scale(img.getWidth() / 12, img.getHeight() / 12);
        img.rotate(-180);
        setImage(img);
        
        
        
        
        
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
                      
            Random random = new Random();
            eliminar(); 
            int randomIndex = random.nextInt(comidas.length);
            
            Comida nuevaComida = comidas[randomIndex];
            
            
            x = Greenfoot.getRandomNumber(mundo.getWidth());
            y = Greenfoot.getRandomNumber(mundo.getHeight());
            mundo.addObject(nuevaComida, x, y);
            // AQUÍ SE COLOCARÁ EL SONIDO CUANDO SE DESTRUYA ALGO 
            
        }
        
        
        
    }
     
    public void setVelocity(int vx, int vy) {
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
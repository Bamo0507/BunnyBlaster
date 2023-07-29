import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rabbit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rabbit extends Actor {
    private int velocidad = 2;
    private boolean direccionPresionada;
    private boolean spacePresionado;
    private boolean spaceUpLeftPresionados;
    private int conteo = Forest.getconteoPuntos();
    
    
    public void act() {
        moverRabbit();
        
        
    }
    
    public Rabbit() {
        GreenfootImage img = new GreenfootImage("Rabbit.png");
        img.scale(img.getWidth() / 12, img.getHeight() / 12);
        setImage(img);
        direccionPresionada = false;
        spacePresionado = false;
    }
    
    private void moverRabbit() {
        
        Forest mundo = (Forest) getWorld();
        if (Greenfoot.isKeyDown("up")) {
            setLocation(getX(), getY() - velocidad);
            direccionPresionada = true;
        }
        if (Greenfoot.isKeyDown("down")) {
            setLocation(getX(), getY() + velocidad);
            direccionPresionada = true;
        }
        if (Greenfoot.isKeyDown("left")) {
            setLocation(getX() - velocidad, getY());
            direccionPresionada = true;
        }
        if (Greenfoot.isKeyDown("right")) {
            setLocation(getX() + velocidad, getY());
            direccionPresionada = true;
        }
                
        if(!Greenfoot.isKeyDown("space")){
            spacePresionado = false;
        }
        
        
        if (Greenfoot.isKeyDown("space") && !spacePresionado && (direccionPresionada || spaceUpLeftPresionados)) {
            // Obtener la dirección actual del conejo
            int direccionX = 0;
            int direccionY = 0;
            
            if (Greenfoot.isKeyDown("up")) {
                direccionY = -1;
            } else if (Greenfoot.isKeyDown("down")) {
                direccionY = 1;
            }
            
            if (Greenfoot.isKeyDown("left")) {
                direccionX = -1;
            } else if (Greenfoot.isKeyDown("right")) {
                direccionX = 1;
            }
            
            
            if (mundo.conteoPuntos % 2000 == 0 && mundo.conteoPuntos <= 10000){
                velocidad++;
            }
            

            
            Carrot zanahoria = new Carrot();
            getWorld().addObject(zanahoria, getX(), getY());
            zanahoria.setVelocity(direccionX * velocidad, direccionY * velocidad);
            spacePresionado = true;    
            
            
            
            }
            direccionPresionada = false;// Reiniciar la variable para que no se dispare más de una zanahoria
        }
        
    
        
}


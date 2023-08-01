import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootSound;
import java.util.Random;



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
    private int vidas;
    private static final int LIMITE_VIDAS = 3;
    public static int contJunk;
    private Comida[] comidas = {new burguer(), new donut(), new fries(), new apple(), new cherry(), new mora()};
    private int x;
    private int y;
    
    public void act() {
        moverRabbit();
        verificarSaludable();
        
        
    }
    
    public Rabbit() {
        GreenfootImage img = new GreenfootImage("Rabbit.png");
        img.scale(img.getWidth() / 12, img.getHeight() / 12);
        setImage(img);
        direccionPresionada = false;
        spacePresionado = false;
        contJunk = 0;
        
       

    }
    

    private void gameOver() {
        GreenfootImage gameOverImage = new GreenfootImage("Game Over", 48, Color.RED, null);
        getWorld().getBackground().drawImage(gameOverImage, (getWorld().getWidth() - gameOverImage.getWidth()) / 2, getWorld().getHeight() / 2);
        Greenfoot.stop(); // Detener el juego.
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
            
            
            if (mundo.conteoPuntos % 2250 == 50 && mundo.conteoPuntos <= 10000){
                velocidad++;
            }
            

            
            Carrot zanahoria = new Carrot();
            getWorld().addObject(zanahoria, getX(), getY());
            zanahoria.setVelocity(direccionX * velocidad, direccionY * velocidad);
            spacePresionado = true;    
            
            
            
            }
            direccionPresionada = false;// Reiniciar la variable para que no se dispare más de una zanahoria
        }
        
    private void verificarSaludable(){     
        Actor junk = getOneIntersectingObject(Junkfood.class);
        if (junk != null) {
            contJunk++;
            removeTouching(Junkfood.class);
            World world = getWorld();
            Forest mundo = (Forest) getWorld();     
            Greenfoot.playSound("bad.wav");
            
            mundo.conteoPuntos -= 50; 
            
            Random random = new Random();
            int randomIndex = random.nextInt(comidas.length);
            Comida nuevaComida = comidas[randomIndex];           
            x = Greenfoot.getRandomNumber(mundo.getWidth());
            y = Greenfoot.getRandomNumber(mundo.getHeight());
            mundo.addObject(nuevaComida, x, y);
        }
        
        Comida f = (Comida)getOneIntersectingObject(Comida.class);
        
        Actor health = getOneIntersectingObject(healthy.class);
        if (health != null) {
            removeTouching(healthy.class);
            World world = getWorld();
            Forest mundo = (Forest) getWorld();     
            Greenfoot.playSound("nice2.wav");
            mundo.conteoPuntos += 50; 
            Random random = new Random();
            int randomIndex = random.nextInt(comidas.length);
            
            Comida nuevaComida = comidas[randomIndex];
            
            
            x = Greenfoot.getRandomNumber(mundo.getWidth());
            y = Greenfoot.getRandomNumber(mundo.getHeight());
            mundo.addObject(nuevaComida, x, y);
        }
    }
}
   

    



import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lifes here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Vidas extends Actor {
    private int vidas;
    private static final int LIMITE_VIDAS = 3;

    public Vidas() {
        vidas = LIMITE_VIDAS;
        
    }

    public void disminuirVidas() {
        vidas--;
        if (vidas <= 0) {
            // Aquí puedes agregar la lógica para cuando el conejo se quede sin vidas.
            // Puede ser un mensaje de Game Over, reiniciar el juego, etc.
        }
    }
}


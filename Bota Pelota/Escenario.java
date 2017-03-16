import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;

public class Escenario extends World{
    
    public Escenario(){    
        /*Create a new world with 600x400 cells with a cell size of 1x1 pixels.*/
        super(600, 400, 1, true);    
        prepare();
    }

    @Override
    public void act(){
        if(Greenfoot.mouseClicked(this)){ 
            MouseInfo raton = Greenfoot.getMouseInfo();
            super.addObject(new Pelota(), raton.getX(), raton.getY());
            //System.out.println("Coordenadas x = " + raton.getX() + ", y = " + raton.getY());
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Jugador jugador = new Jugador();
        addObject(jugador,311,380);
        jugador.setLocation(301,371);
        jugador.setLocation(304,374);
        Pelota pelota = new Pelota();
        addObject(pelota,495,97);
        Pelota pelota2 = new Pelota();
        addObject(pelota2,69,200);
        Pelota pelota3 = new Pelota();
        addObject(pelota3,218,63);
        Disparo disparo = new Disparo();
        addObject(disparo,310,332);
        disparo.setLocation(302,328);
        disparo.setLocation(304,327);
        disparo.setLocation(303,331);
    }
}

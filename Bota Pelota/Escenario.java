import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;

public class Escenario extends World{
    LinkedList<Pelota> pelotas;
    public Escenario(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, true);
       
        pelotas = new LinkedList<Pelota>();
    }
    
    @Override
    public void act(){
        if(Greenfoot.mouseClicked(this)){ 
            MouseInfo raton = Greenfoot.getMouseInfo();
            
            super.addObject(new Pelota(), raton.getX(), raton.getY());
            System.out.println("Coordenadas x = " + raton.getX() + ", y = " + raton.getY());
        }
    }
}

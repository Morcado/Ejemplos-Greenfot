import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Jugador extends Actor{
    private boolean disp;
    
    public Jugador(){
        disp = false;
    }
    
    @Override
    public void act() {
        if(Greenfoot.isKeyDown("right"))
            this.setLocation(this.getX()+3, getY());
        if(Greenfoot.isKeyDown("left"))
            this.setLocation(this.getX()-3, getY());
      
        if(Greenfoot.isKeyDown("space") && !disp){
            World world = this.getWorld();
            world.addObject(new Disparo(), this.getX(), this.getY()-5);
            disp = true;
            //this.delay(100);
        }
        
        /*revisra cuanto disparos hay en el mundo*/
        World world = this.getWorld();
        List lista = world.getObjects(Disparo.class);
        if(lista.isEmpty())
            disp = false;
    }    
}

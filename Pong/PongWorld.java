import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PongWorld  extends World{
    private Boolean juego;

    public PongWorld(){    
        super(700, 500, 1);
        
        Paddle p1 = new Paddle("s", "a", "P2", 30);
        Paddle p2 = new Paddle("right", "left", "P2", 470);
        
        addObject(p1, 350, 30);
        addObject(p2, 350, 470);
        addObject(new Ball(), 350, 250);
        
        
    }
    
    
}

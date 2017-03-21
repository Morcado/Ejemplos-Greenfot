import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Paddle  extends Actor{
    private int puntuacion;
    private String con1;
    private String con2;
    private GreenfootImage punt;
    private String p2;
    
    public Paddle(String c1, String c2){
        con1 = c1;
        con2 = c2;
        puntuacion = 0;
        p2 = "P2: ";
        punt = new GreenfootImage(p2);
    }
    
    @Override
    public void act(){
        this.dibuja();
        
        if(Greenfoot.isKeyDown(con1))
            this.setLocation(this.getX()+5, getY());
        if(Greenfoot.isKeyDown(con2))
            this.setLocation(this.getX()-5, getY());
            
        if(this.isTouching(Ball.class) && puntuacion <= 5){
            puntuacion++;
            
            
            punt.drawImage(punt, 10, 10);
        }
        else
            if(puntuacion == 5){
                
               punt.drawImage(punt, 10, 10);
            }
                
    }    
    
    public void dibuja(){
        punt.drawImage(punt, 10, 100);
    }
}

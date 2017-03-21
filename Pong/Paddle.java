import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Paddle  extends Actor{
    private int puntuacion;
    private String con1;
    private String con2;
    GreenfootImage punt;
    private String player;
    private int ye;
    private World mundo;
    
    public Paddle(String c1, String c2, String p, int y){
        con1 = c1;
        con2 = c2;
        puntuacion = 0;
        player = p;
        ye = y;
        mundo = this.getWorld();
        //punt = new GreenfootImage(10, 100);
    }
    
    @Override
    public void act(){
        //this.dibuja();
        
        if(Greenfoot.isKeyDown(con1))
            this.setLocation(this.getX()+5, getY());
            
        if(Greenfoot.isKeyDown(con2))
            this.setLocation(this.getX()-5, getY());
            
        if(this.isTouching(Ball.class)){
            puntuacion++;
            //this.setLocation(350, ye);
             mundo.showText(""+puntuacion, 50,50);
        }
        else
            if(puntuacion == 5){
               //Greenfoot.ask("d ");
               //punt.drawImage(punt, 10, 10);
            }
                
    }    
    
   
}

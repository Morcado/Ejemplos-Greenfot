import greenfoot.*; 

public class Pelota extends Actor{
    private int incx;
    private int incy;
    
    public Pelota(){
        incx = 10;
        incy = 10;
    }
    
    @Override
    public void act(){
        /*consulta las coordenadas actuales heredadas de actor*/
        int posx = this.getX();
        int posy = this.getY();
        /*calculamos las coordenadas*/
        int nuevox = posx+incx;
        int nuevoy = posy+incy;
        /*cambiamos de posicion a la pelota*/
        this.setLocation(nuevox, nuevoy);
        
        
        /*accedemos al mundo para conocer su tamaño*/
        World mundo = this.getWorld();
        
        if(nuevox > mundo.getWidth()){ /*rebota en lado derecho*/
            incx = -incx;
        }
        if(nuevoy > mundo.getHeight()){ /*rebota en abajo*/
            incy = -incy;
        }
        if(nuevoy < 0){ /*rebota arriba*/
            incy = -incy;
        }
        if(nuevox < 0){
            incx = -incx; /*rebota izquierda*/
        }
    }
}

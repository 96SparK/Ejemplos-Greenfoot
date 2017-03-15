import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pelota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pelota extends Actor
{
    private int incx;
    private int incy;
    public void Pelota() 
    {
        incx = 10;
        incy = 10;
    }
    
    @Override
    public void act()
    {
        //consulta las coordenadas actuales heredadas de actor
        int posx = this.getX();
        int posy = this.getY();
        //nuevas coordenadas para la pelota
        int nuevox = posx + incx;
        int nuevoy = posy + incy;
        
        World mundo = this.getWorld();
        if(nuevox >= mundo.getWidth()) //rebota de lado derecho
        {
            incx = -incx;
        }
        if(nuevoy >= mundo.getHeight()) //rebota en la parte de abajo
        {
            incy = -incy;
        }
        if(posy < 0) //rebota arriba
        {
            incy = -incy;
        }
        if(posx < 0) //rebota izquierda
        {
            incx = -incx;
        }
        //cambiamos de posicion a la pelota
        this.setLocation(nuevox, nuevoy);
    }
}

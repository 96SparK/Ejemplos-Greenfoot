import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

public class Jugador extends Actor
{
    private boolean disparando = true;
    @Override
    public void act() 
    {
        // Si presiona la tecla derecha muevete a la derecha
        if(Greenfoot.isKeyDown("Right"))
        {
            this.setLocation(this.getX()+1,this.getY());
        }
        if(Greenfoot.isKeyDown("Left"))
        {
            this.setLocation(this.getX()-1,this.getY());
        }
        if(Greenfoot.isKeyDown("Down"))
        {
            this.setLocation(this.getX(),this.getY()+1);
        }
        if(Greenfoot.isKeyDown("Up"))
        {
            this.setLocation(this.getX(),this.getY()-1);
        }
        if(Greenfoot.isKeyDown("space") && disparando)
        {
            Disparo shoot = new Disparo();
            World mundo = this.getWorld();
            mundo.addObject(shoot,this.getX(),this.getY());
            this.setLocation(this.getX(),this.getY());
        }
        
        World mundo = this.getWorld();
        List lista = mundo.getObjects(Disparo.class);
        if(lista.isEmpty())
        {
            disparando = false;
        }
    }    
}

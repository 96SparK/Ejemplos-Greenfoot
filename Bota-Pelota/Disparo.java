import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Disparo extends Actor
{
    public void act() 
    {
        //if(Greenfoot.isKeyDown("space"))
        {
            this.setLocation(this.getX(),this.getY()-1);
            if(this.getY() == 0)
            {
                World mundo = this.getWorld();
                mundo.removeObject(this);
            }
        }
    }    
}

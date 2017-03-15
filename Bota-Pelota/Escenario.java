import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Escenario extends World
{
    public Escenario()
    {
        super(600, 400, 1, true);
    }
    @Override
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            System.out.println("Click");
            MouseInfo raton = Greenfoot.getMouseInfo();
            System.out.println("Coordenadas x = "+ raton.getX() +" , y = " + raton.getY());
        }
    }
}
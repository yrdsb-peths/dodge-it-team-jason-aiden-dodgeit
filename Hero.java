import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    int y = 100;
    public void act()
    {
        setLocation(100,y);
        if(Greenfoot.isKeyDown("s"))
        {
            y += 3;
        }
        if(Greenfoot.isKeyDown("w"))
        {
            y -= 3;
        }
        detectCollision();
    }
    public void detectCollision()
    {
        
    }
}

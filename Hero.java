import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    double y = 100;
    double speedY = 0;
    public void act()
    {
        setLocation(100, (int)y);
        if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down"))
        {
            speedY += 0.3;
        }
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up"))
        {
            speedY -= 0.3;
        }
        if(y <= 10)
        {
            speedY = 0.3;
        }
        if(y >= 390)
        {
        
            speedY = -0.3;
        }
        detectCollision();
        y += speedY;
    }
    public void detectCollision()
    {
        
    }
}

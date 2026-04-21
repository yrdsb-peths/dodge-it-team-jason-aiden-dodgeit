import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{

    double y = 100;
    double speedY = 0;
    
    public Hero() {
        GreenfootImage image = new GreenfootImage("ppl1.png");
        setImage(image);
    }

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
        if(y < 1)
        {
            y = 390.0;
        }
        if(y > 399)
        {
        
            y = 5.0;
        }
        y += speedY;
        if(MyWorld.lives == 0)
        {
            getWorld().removeObject(this);
        }
    }
}

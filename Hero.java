import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    int y = 100;



    public Hero() {
        GreenfootImage image = new GreenfootImage("ppl1.png");
        setImage(image);
    }


    public void act()
    {
        setLocation(100,y);
        if(Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("down"))
        {
            y *= 1.05;
        }
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("up"))
        {
            y *= 0.05;
        }
        detectCollision();
    }
    public void detectCollision()
    {
        
    }
}

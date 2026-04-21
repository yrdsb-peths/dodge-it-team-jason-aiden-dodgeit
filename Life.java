import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Life here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Life extends Actor
{
    public Life() {
        GreenfootImage image = new GreenfootImage("herz.png");
        setImage(image);
    }
    
    public void act()
    {
        if(MyWorld.lives == 3 && getX() == 350)
        {
            getWorld().removeObject(this);
        }
        if(MyWorld.lives == 2 && getX() == 450)
        {
            getWorld().removeObject(this);
        }
        if(MyWorld.lives == 1 && getX() == 550)
        {
            getWorld().removeObject(this);
        }
    }
}

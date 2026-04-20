import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Actor
{
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public Banana() {
        GreenfootImage image = new GreenfootImage("bananas.png");
        setImage(image);
    }

    public void act()
    {
        move(-5);
        if (getX() <= 0) {
            resetLocation();
        }
    }

    public void resetLocation() {
        setLocation(600, Greenfoot.getRandomNumber(400));
        
    }
}

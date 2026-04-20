import greenfoot.*;

public class MyWorld extends World {
    public MyWorld() {
        super(600, 400, 1);
        //addObject(new Player(), 100, 150);
        addObject(new Banana(), 600, Greenfoot.getRandomNumber(400));
    }
}

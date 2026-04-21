import greenfoot.*;

public class MyWorld extends World {
    static int lives = 3;
    static int score = 0;
    public MyWorld() {
        
        super(600, 400, 1);
        MyWorld.lives = 3;
        addObject(new Banana(), 600, Greenfoot.getRandomNumber(400));
        addObject(new Hero(),100,100);
        addObject(new Life(),550,350);
        addObject(new Life(),450,350);
        addObject(new Life(),350,350);
    }
}

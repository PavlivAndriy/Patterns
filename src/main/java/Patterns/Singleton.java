package Patterns;

/**
 * Created by Andriy on 1/10/2016.
 */
public class Singleton {
    private static Singleton instance = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance() {
        return instance;
    }
}

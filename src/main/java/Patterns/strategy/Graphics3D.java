package Patterns.strategy;

/**
 * Created by Andriy on 1/11/2016.
 */
public class Graphics3D implements Graphics{
    public String video() {
        return "High Graphics";
    }

    public String fps() {
        return "Low fps";
    }

    @Override
    public String toString() {
        return video() + " and " + fps();
    }
}


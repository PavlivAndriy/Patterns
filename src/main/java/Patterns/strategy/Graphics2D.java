package Patterns.strategy;

/**
 * Created by Andriy on 1/11/2016.
 */
public class Graphics2D implements Graphics {
    public String video() {
        return "Low Graphics";
    }

    public String fps() {
        return "High fps";
    }

    @Override
    public String toString() {
        return video() + " and " + fps();
    }
}

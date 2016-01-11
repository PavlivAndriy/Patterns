package Patterns.builder;

/**
 * Created by Andriy on 1/11/2016.
 */
public class Car {
    String mark;
    String color;
    int speed;

    public void setMark(String mark) {
        this.mark = mark;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " - (Mark: " + mark +
                "; color: " + color + "; speed: " + speed + ")";
    }
}


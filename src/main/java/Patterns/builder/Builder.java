package Patterns.builder;

/**
 * Created by Andriy on 1/11/2016.
 */
public class Builder {
    public static void main(String[] args) {
            Car car = new CarBuilder()
                    .buildMark("Tesla")
                    .buildColor("Black")
                    .buildSpeed(300)
                    .build();

        System.out.println(car);
    }
}

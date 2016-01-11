package Patterns.builder;

/**
 * Created by Andriy on 1/11/2016.
 */
public class CarBuilder {
    String m = "Default";
    String c = "Black";
    int s = 120;

    CarBuilder buildMark(String m){
        this.m = m;
        return this;
    }
    CarBuilder buildColor(String c){
        this.c = c;
        return this;
    }
    CarBuilder buildSpeed(int s){
        this.s = s;
        return this;
    }
    Car build(){
        Car car = new Car();
        car.setMark(m);
        car.setColor(c);
        car.setSpeed(s);
        return car;
    }
}

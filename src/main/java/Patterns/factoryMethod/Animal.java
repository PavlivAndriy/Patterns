package Patterns.factoryMethod;

/**
 * Created by Andriy on 1/10/2016.
 */
public class Animal {

    public static final int bird = 1;
    public static final int dog = 2;
    public static final int cat = 3;
    public String info(){
        return "Animal";
    }

    public static Animal createAnimal(int type){
        if (type == bird){
            return new Bird();
        } else if (type == dog){
            return new Dog();
        } else if (type == cat){
            return new Cat();
        }
        return new Animal();
    }

    @Override
    public String toString() {
        return this.info();
    }
}

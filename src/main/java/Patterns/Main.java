package Patterns;

import Patterns.factoryMethod.*;
import Patterns.singleton.Singleton;

/**
 * Created by Andriy on 1/10/2016.
 */
public class Main {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        System.out.println(Animal.createAnimal(0));
        System.out.println(Bird.createAnimal(1));
        System.out.println(Dog.createAnimal(2));
        System.out.println(Cat.createAnimal(3));


    }
}

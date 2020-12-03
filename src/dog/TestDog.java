package dog;

import dog.Dog;

import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Sharik", 2);
        Dog d2 = new Dog("Rex", 7);
        Dog d3 = new Dog("Maksim", 1);
        System.out.println(d1);
        d1.intoHumanAge();
        d2.intoHumanAge();
        d3.intoHumanAge();
    }
}
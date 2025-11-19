package org.example.OOPs.Inheritance;

public class InheritanceExample {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        Animal a2 = new Dog();
        Dog d1 = new Dog();

        a1.eatingHabit();
        a2.eatingHabit();

        d1.eatingHabit();
        d1.makeSound();
    }
}

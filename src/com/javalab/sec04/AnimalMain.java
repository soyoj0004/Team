package com.javalab.sec04;

public class AnimalMain {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];

        animals[0] = new Dog("강아지");
        animals[1] = new Cat("고양이");

        for (Animal animal : animals) {
            System.out.print(animal.getSpecies() + ": ");
            animal.makeSound();
        }
    }
}


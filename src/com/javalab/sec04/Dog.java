package com.javalab.sec04;


public class Dog implements Animal {
    private String species;

    public Dog(String species) {
        this.species = species;
    }

    @Override
    public void makeSound() {
        System.out.println(species + " 월월");
    }

    @Override
    public String getSpecies() {
        return species;
    }
}


package com.javalab.sec04;

public class Cat implements Animal {
    private String species;

    public Cat(String species) {
        this.species = species;
    }

    @Override
    public void makeSound() {
        System.out.println(species + " 야옹.");
    }

    @Override
    public String getSpecies() {
        return species;
    }
}

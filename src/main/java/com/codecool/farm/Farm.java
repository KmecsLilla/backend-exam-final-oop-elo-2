package com.codecool.farm;

import com.codecool.farm.animal.Animal;

import java.util.ArrayList;
import java.util.List;

class Farm {

    List<Animal> animals = new ArrayList<>();

    public Farm(List<Animal> animals) {
        this.animals = animals;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void feedAnimals() {
        for (Animal animal: animals) {
            animal.feed();
        }
    }

    public void butcher(Butcher butcher) {
        List<Animal> animalsReadyToDie = new ArrayList<>();
        for (Animal animal: animals) {
            if (butcher.canButcher(animal)) {
                animalsReadyToDie.add(animal);
            }
        }
        animals.removeAll(animalsReadyToDie);
    }

    public boolean isEmpty() {
        return animals.isEmpty();
    }

    public List<String> getStatus() {
        List<String> result = new ArrayList<>();
        for (Animal animal: animals) {
            result.add(animal.toString());
        }
        return result;
    }
}

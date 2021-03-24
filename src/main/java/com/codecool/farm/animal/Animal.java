package com.codecool.farm.animal;

public abstract class Animal {

    protected int size = 0;

    public int getSize() {
        return size;
    }

    public abstract void feed();

    @Override
    public String toString() {
        return "There is a " + size +
            " sized " + getClass().getSimpleName().toLowerCase() + " in the farm.";
    }
}

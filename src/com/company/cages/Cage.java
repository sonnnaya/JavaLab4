package com.company.cages;

import com.company.animals.Animal;

import java.util.ArrayList;

public abstract class Cage<T extends Animal> {
    private final int capacity;
    private final ArrayList<T> collection;

    public Cage(int capacity) {
        this.capacity = capacity;
        this.collection = new ArrayList<>(capacity);
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTakenCapacity() {
        return collection.size();
    }

    public void add(T animal) throws IllegalStateException {
        if (getTakenCapacity() == getCapacity())
            throw new IllegalStateException("The cage is full.");
        else
            collection.add(animal);
    }

    public void remove(T animal) throws IllegalStateException {
        if (collection.isEmpty())
            throw new IllegalStateException("Cage is empty.");
        else if (!collection.remove(animal))
            throw new IllegalStateException("Cage doesn't store such instance.");
    }
}

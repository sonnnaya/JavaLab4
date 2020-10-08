package com.company;

import com.company.cages.Cage;

import java.util.ArrayList;

public class Zoo {
    public ArrayList<Cage> cages = new ArrayList<>();

    public int getCountOfAnimals() {
        int count = 0;
        for (Cage cage : cages)
            count += cage.getTakenCapacity();
        return count;
    }

    public <T extends Cage> void addCage(T cage) {
        cages.add(cage);
    }

    public void addCageList(ArrayList<? extends Cage> cageList) throws IllegalArgumentException {
        if (cageList == null)
            throw new IllegalArgumentException();
        cages.addAll(cageList);
    }
}

package com.company.cages;

import com.company.animals.Bird;

public class BirdCage<T extends Bird> extends Cage<T> {
    public BirdCage(int capacity) {
        super(capacity);
    }
}

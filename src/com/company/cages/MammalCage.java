package com.company.cages;

import com.company.animals.Mammal;

public abstract class MammalCage<T extends Mammal> extends Cage<T> {
    public MammalCage(int capacity) {
        super(capacity);
    }
}

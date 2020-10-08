package com.company.cages;

import com.company.animals.Ungulate;

public class UngulateCage<T extends Ungulate> extends MammalCage<T> {
    public UngulateCage(int capacity) {
        super(capacity);
    }
}

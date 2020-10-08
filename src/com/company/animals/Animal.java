package com.company.animals;

import java.util.Objects;

public abstract class Animal {
    private final String name;
    private final Integer age;

    public Animal(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public final int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public final boolean equals(Object object) {
        if (!(object instanceof Animal)) return false;
        if (object == this) return true;

        var animal = (Animal) object;
        var isSameName = Objects.equals(name, animal.getName());
        var isSameAge = Objects.equals(age, animal.getAge());

        return isSameName && isSameAge;
    }
}

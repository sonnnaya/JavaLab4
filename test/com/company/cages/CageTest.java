package com.company.cages;

import com.company.animals.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CageTest {
    LionCage lionCage = new LionCage(2);
    BirdCage<Bird> birdCage = new BirdCage<>(2);
    UngulateCage<Ungulate> ungulateCage = new UngulateCage<>(2);

    @BeforeEach
    void setUp() {
        lionCage.add(new Lion("Leo", 12));
        lionCage.add(new Lion("Nyam", 11));
        birdCage.add(new Eagle("Kir", 15));
        birdCage.add(new Eagle("Rin", 13));
        ungulateCage.add(new Zebra("Martin", 10));
        ungulateCage.add(new Giraffe("Melman", 18));
    }

    @Test
    void testAddWithCorrectElement() {
        var lionCage = new LionCage(2);
        var birdCage = new BirdCage<>(2);
        var ungulateCage = new UngulateCage<>(2);

        assertDoesNotThrow(() -> lionCage.add(new Lion("Leo", 12)));
        assertDoesNotThrow(() -> birdCage.add(new Eagle("Kir", 15)));
        assertDoesNotThrow(() -> ungulateCage.add(new Zebra("Martin", 10)));
        assertDoesNotThrow(() -> ungulateCage.add(new Giraffe("Melman", 18)));
    }

    @Test
    void testAddWithOverflowElement() {
        assertThrows(IllegalStateException.class, () -> lionCage.add(new Lion("Leo", 12)));
        assertThrows(IllegalStateException.class, () -> birdCage.add(new Eagle("Kir", 15)));
        assertThrows(IllegalStateException.class, () -> ungulateCage.add(new Zebra("Martin", 10)));
    }

    @Test
    void testRemoveWithContainingElement() {
        assertDoesNotThrow(() -> lionCage.remove(new Lion("Leo", 12)));
        assertDoesNotThrow(() -> birdCage.remove(new Eagle("Kir", 15)));
        assertDoesNotThrow(() -> ungulateCage.remove(new Zebra("Martin", 10)));
    }

    @Test
    void testRemoveWithNotContainingElement() {
        assertThrows(IllegalStateException.class, () -> lionCage.remove(new Lion("LLeo", 12)));
        assertThrows(IllegalStateException.class, () -> birdCage.remove(new Eagle("KKir", 15)));
        assertThrows(IllegalStateException.class, () -> ungulateCage.remove(new Zebra("MMartin", 10)));
    }
}
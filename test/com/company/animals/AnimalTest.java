package com.company.animals;

import org.junit.jupiter.api.Test;
import nl.jqno.equalsverifier.EqualsVerifier;

class AnimalTest {

    @Test
    void testEquals() {
        EqualsVerifier.forClass(Animal.class).verify();
    }
}
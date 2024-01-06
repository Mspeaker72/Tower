package org.example.Tower;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloorTest {

    public Floor floor = new Floor();

    @Test
    void isBossFloor() {
        assertFalse(floor.isBossFloor());
    }

    @Test
    void clear() {
        assertFalse(floor.clear());
    }


    @Test
    void getCurrentFloor() {
        assertEquals(floor.getCurrentFloor(),1);

    }

    @Test
    void getCurrentStep() {
        floor.step(6);
        assertEquals(floor.getCurrentStep(),6);
    }

    @Test
    void isBossFloorTrue() {
        for (int i = 0;i<9;i++) {
            floor.next();
        }
        assertTrue(floor.isBossFloor());
    }
}
package org.example.Tower;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FloorTest {

    public Floor floor;
    @BeforeEach
     void startup(){
        floor = new Floor();
    }

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
        for (int i = 0;i<19;i++) {
            floor.next();
        }
        assertTrue(floor.isBossFloor());
        System.out.println(floor.getCurrentFloor());
    }

    @Test

    void StopAtTenthFloor() {

        for (int i = 0;i<20;i++) {
            floor.step(1);
        }
        assertEquals(10, floor.getCurrentStep());
    }
}
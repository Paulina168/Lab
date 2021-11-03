package simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {

    Wektor2D vector1 = new Wektor2D(2,3);
    Wektor2D vector2 = new Wektor2D(2,3);
    Wektor2D vector3 = new Wektor2D(1,4);

    @Test
    void testToString() {
        assertEquals("(2,3)",vector1.toString());
    }

    @Test
    void testEquals() {
        assertEquals(vector1,vector2);
    }

    @Test
    void add() {
        assertEquals(new Wektor2DT(3,7),vector1.add(vector3));
    }

    @Test
    void opposite() {
        assertEquals(new Wektor2D(-2,-3),vector1.opposite());
    }

    @Test
    void substract() {
        assertEquals(new Wektor2D((1,-1),vector1.substract(vector3)));
    }
}
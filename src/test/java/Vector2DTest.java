package simulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Vector2DTest {

    Vector2D vector1 = new Vector2D(2, 3);
    Vector2D vector2 = new Vector2D(2, 3);
    Vector2D vector3 = new Vector2D(1, 4);

    @Test
    void testToString() {
        assertEquals("(2, 3)", vector1.toString());
    }

    @Test
    void testEquals() {
        assertEquals(vector1, vector2);
    }

    @Test
    void add() {
        assertEquals(new Vector2D(3, 8), vector1.add(vector3));
    }

    @Test
    void opposite() {
        assertEquals(new Vector2D(-2, -3), vector1.opposite());
    }

    @Test
    void subtract() {
        assertEquals(new Vector2D(1, -1), vector1.subtract(vector3));
    }
}
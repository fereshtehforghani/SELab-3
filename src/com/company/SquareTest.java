package com.company;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SquareTest {
    private float a = (float) 5;

    private Square square = new Square(a);

    @Test
    public void testSquareArea() {
        assertEquals(a * a, square.computeArea(), 0.0001);
    }

    @Test
    public void testSetGetA(){
        square.setA((float) 5.1);
        assertEquals(5.1, square.getA(), 0.0001);
    }

}

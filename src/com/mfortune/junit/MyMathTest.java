package com.mfortune.junit;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyMathTest {
    private MyMath math = new MyMath();
    @Test
    void test1() {
        assertEquals(math.calculateSum(new int[]{}), 0);
    }

    @Test
    void test2() {
        assertEquals(math.calculateSum(new int[]{1, 2, 3}), 0);
    }
}

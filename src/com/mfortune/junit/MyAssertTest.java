package com.mfortune.junit;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MyAssertTest {
    List<String> todos = Arrays.asList("AWS", "Azure", "DevOps");
    @Test
    public void test() {
        boolean test = todos.contains("AWS");
        boolean test2 = todos.contains("Angular");
       // assertNull(todos);
       // assertNotNull(todos);
        assertTrue(test);
        assertFalse(test2);
        assertEquals(todos.size(), 3);
        assertArrayEquals(new int[]{1, 2}, new int[]{1, 2});
    }
}
package com.mfortune.junit;
import org.junit.After;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
public class MyUnitTests {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Before each");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each");
    }

    @Test
    public void test1() {
        System.out.println("test1");
    }
    @Test
    public void test2() {
        System.out.println("test2");
    }
    @Test
    public void test3() {
        System.out.println("test3");
    }
    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }
}

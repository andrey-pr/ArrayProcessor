package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayProcessorTest {

    @Test
    void process1() {
        assertArrayEquals(new int[]{}, ArrayProcessor.process(new int[]{}));
    }

    @Test
    void process2() {
        assertArrayEquals(new int[]{4, 2}, ArrayProcessor.process(new int[]{5, 4, 3, 2, 1}));
    }

    @Test
    void process3() {
        assertArrayEquals(new int[]{6, 4, 2}, ArrayProcessor.process(new int[]{2, 4, 6}));
    }

    @Test
    void process4() {
        assertArrayEquals(new int[]{4, 2}, ArrayProcessor.process(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    void process5() {
        assertArrayEquals(new int[]{10, 8, 6, 4, 2}, ArrayProcessor.process(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
    }
}
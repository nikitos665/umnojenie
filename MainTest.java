package com.company;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @org.junit.jupiter.api.Test
    void main() {

    }

    @org.junit.jupiter.api.Test
    void delen() {
        assertEquals(20, Main.delen(4,5));
    }

    @org.junit.jupiter.api.Test
    void biti() {
        assertEquals(20, Main.biti(4,5));
    }

    @org.junit.jupiter.api.Test
    void binaryAdd() {
        assertEquals(20, Main.binaryAdd(4,5));
    }

    @org.junit.jupiter.api.Test
    void integer() {
        assertEquals(20, Main.Integer(4,5));
    }

    @org.junit.jupiter.api.Test
    void aray() {
        assertEquals(20, Main.aray(4,5));
    }

    @org.junit.jupiter.api.Test
    void iteraci() {
        assertEquals(20, Main.iteraci(4,5));
    }

    @org.junit.jupiter.api.Test
    void recursi() {
        assertEquals(20, Main.recursi(4,5));
    }
}
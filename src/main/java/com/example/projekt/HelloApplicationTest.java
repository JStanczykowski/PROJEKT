package com.example.projekt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloApplicationTest {
    @Test
    void test(){
        var te= new HelloApplication.dodawanie();
        assertEquals(4,te.dodaj(2,2));
    }

}
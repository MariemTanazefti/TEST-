package com.example.test;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestSomme {
    @Test
    public void addition(){
        Somme somme=new Somme();
        int result = somme.add(4,1);
        int expected = 5;
        assertEquals(expected, result);
    }
}


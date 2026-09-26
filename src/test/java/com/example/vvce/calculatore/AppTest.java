package com.example.vvce.calculatore;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	App app=new App();

    /**
     * Rigorous Test :-)
     */
    @Test
    void testAdd() {
    	assertEquals(25,app.add(20,5));
    }
    
    void testSubstract() {
    	assertEquals(15,app.sub(20,5));
    }
    
    
    void testMultiplication() {
    	assertEquals(15,app.mul(20,5));
    }

}

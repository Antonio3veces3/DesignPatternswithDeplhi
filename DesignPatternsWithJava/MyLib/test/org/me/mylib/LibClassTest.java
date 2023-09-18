/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package org.me.mylib;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author aanto
 */
public class LibClassTest {
    
    public LibClassTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of acrostic method, of class LibClass.
     */
    @Test
    public void testAcrostic() {
       /* System.out.println("acrostic");
        String[] args = null;
        String expResult = "";
        String result = LibClass.acrostic(args);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");*/
       System.err.println("Running testAcrostic");
       String result= LibClass.acrostic(new String[]{"fnord", "polly","tropism"});
       assertEquals("Correct value", "foo", result);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author JjyKs
 */
public class NodeTest {
    
    public NodeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNeighbour method, of class Node.
     */
    @Test
    public void testGetNeighbour() {
        System.out.println("getNeighbour");
        int position = 0;
        Node instance = null;
        Node expResult = null;
        Node result = instance.getNeighbour(position);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNeighbour method, of class Node.
     */
    @Test
    public void testSetNeighbour() {
        System.out.println("setNeighbour");
        int position = 0;
        Node node = null;
        Node instance = null;
        instance.setNeighbour(position, node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Node.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Node node = null;
        Node instance = null;
        boolean expResult = false;
        boolean result = instance.equals(node);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class Node.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Node otherNode = null;
        Node instance = null;
        int expResult = 0;
        int result = instance.compareTo(otherNode);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

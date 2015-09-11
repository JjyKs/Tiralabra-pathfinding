/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiralabra.pathfinding;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jjyks
 */
public class PathTest {
    
    public PathTest() {
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
     * Test of addPathNodeToEnd method, of class Path.
     */
    @Test
    public void testAddPathNodeToEnd() {
        System.out.println("addPathNodeToEnd");
        Node n = null;
        Path instance = new Path();
        instance.addPathNodeToEnd(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AddPathNodeToStart method, of class Path.
     */
    @Test
    public void testAddPathNodeToStart() {
        System.out.println("AddPathNodeToStart");
        Node n = null;
        Path instance = new Path();
        instance.AddPathNodeToStart(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class Path.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        int x = 0;
        int y = 0;
        Path instance = new Path();
        boolean expResult = false;
        boolean result = instance.contains(x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

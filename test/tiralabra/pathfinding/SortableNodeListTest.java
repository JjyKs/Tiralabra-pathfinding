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
public class SortableNodeListTest {
    
    public SortableNodeListTest() {
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
     * Test of getFirst method, of class SortableNodeList.
     */
    @Test
    public void testGetFirst() {
        System.out.println("getFirst");
        SortableNodeList instance = new SortableNodeList();
        Node expResult = null;
        Node result = instance.getFirst();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class SortableNodeList.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        SortableNodeList instance = new SortableNodeList();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of add method, of class SortableNodeList.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Node node = null;
        SortableNodeList instance = new SortableNodeList();
        instance.add(node);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of remove method, of class SortableNodeList.
     */
    @Test
    public void testRemove() {
        System.out.println("remove");
        Node n = null;
        SortableNodeList instance = new SortableNodeList();
        instance.remove(n);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of size method, of class SortableNodeList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        SortableNodeList instance = new SortableNodeList();
        int expResult = 0;
        int result = instance.size();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contains method, of class SortableNodeList.
     */
    @Test
    public void testContains() {
        System.out.println("contains");
        Node n = null;
        SortableNodeList instance = new SortableNodeList();
        boolean expResult = false;
        boolean result = instance.contains(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

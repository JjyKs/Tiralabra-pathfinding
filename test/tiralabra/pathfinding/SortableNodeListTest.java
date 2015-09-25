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

    private SortableNodeList nodeList;
    private Node node;

    @Before
    public void setUp() {
        nodeList = new SortableNodeList();
        node = new Node(0, 0, 0);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of add method, of class SortableNodeList.
     */
    @Test
    public void testAdd() {
        nodeList.add(node);
        assertTrue(nodeList.contains(node));
        assertTrue(nodeList.contains(node));
        assertTrue(nodeList.size() == 1);
    }

    /**
     * Test of addSlotsToList method, of class SortableNodeList.
     */
    @Test
    public void testAddSlotsToLists() {
        for (int i = 0; i < 21; i++) {
            nodeList.add(new Node(0, i, i));
        }
        assertTrue(nodeList.size() == 21);
    }

    /**
     * Test of contains method, of class SortableNodeList.
     */
    @Test
    public void testContains() {
        nodeList.add(node);
        assertTrue(nodeList.contains(node));
    }

    /**
     * Test of clear method, of class SortableNodeList.
     */
    @Test
    public void testClear() {
        for (int i = 0; i < 21; i++) {
            nodeList.add(new Node(0, i, i));
        }
        nodeList = new SortableNodeList();
        assertTrue(nodeList.isEmpty());
    }

    /**
     * Test of size method, of class SortableNodeList.
     */
    @Test
    public void testSize() {
        for (int i = 0; i < 21; i++) {
            nodeList.add(new Node(0, i, i));
        }
        assertTrue(nodeList.size() == 21);
    }

    /**
     * Test of isEmpty method, of class SortableNodeList.
     */
    @Test
    public void testIsEmpty() {
        SortableNodeList instance = new SortableNodeList();
        boolean expResult = true;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
    }

    /**
     * Test of remove method, of class NodeLista.
     */
    @Test
    public void testRemove_int() {
        nodeList.add(node);
        nodeList.remove(node);
        assertTrue(nodeList.isEmpty());
    }

}

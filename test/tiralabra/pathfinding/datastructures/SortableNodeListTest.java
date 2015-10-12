package tiralabra.pathfinding.datastructures;

import helpers.Node;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


/**
 *
 * @author JjyKs
 */
public class SortableNodeListTest {

    SortableNodeList nodeList;
    Node[] compareArray;

    @Before
    public void setUp() {
        nodeList = new SortableNodeList();
        compareArray = fillNodeListAndCompareArray();
    }

    @After
    public void tearDown() {
        nodeList = null;
        compareArray = null;
    }
    
    /**
     * Fills the SortableNodeList with nodes
     * @return Array with the same information for comparing.
     */
    public Node[] fillNodeListAndCompareArray(){
        Node[] nodes = new Node[30];
        for (int i = 0; i < 30; i++) {
            Node n = new Node(i, 0, 0);
            nodes[i] = n;
            nodeList.add(n);
        }
        return nodes;
    }

    /**
     * Test of add method, of class SortableNodeList.
     */
    @Test
    public void testAddAndGet() {
        for (int i = 0; i < 30; i++){
            assertThat(compareArray[i], is(nodeList.get(i)));
        }
    }

 
    /**
     * Test of remove method, of class SortableNodeList.
     */
    @Test
    public void testRemove_int() {
        nodeList.remove(0);
        assertThat(null, is(nodeList.get(0)));
    }

    /**
     * Test of getFirst method, of class SortableNodeList.
     */
    @Test
    public void testGetFirst() {
        assertThat(nodeList.getFirst(), is(compareArray[0]));
    }

    /**
     * Test of remove method, of class SortableNodeList.
     */
    @Test
    public void testRemove_Node() {
        for(int i = 0; i < 30; i++){
            nodeList.remove(compareArray[i]);
            assertThat(compareArray[i], is(not(nodeList.get(i))));
        }
    }

    /**
     * Test of contains method, of class SortableNodeList.
     */
    @Test
    public void testContains() {
        for(int i = 0; i < 30; i++){
            assertThat(true, is(nodeList.contains(compareArray[i])));
        }               
        assertThat(false, is(nodeList.contains(new Node(1,1,1))));
    }
}

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
public class PathfindingLogicTest {
    
    public PathfindingLogicTest() {
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
     * Test of estimateDistanceToTarget method, of class PathfindingLogic.
     */
    @Test
    public void testEstimateDistanceToTarget() {
        System.out.println("estimateDistanceToTarget");
        int positionX = 0;
        int positionY = 0;
        int targetX = 0;
        int targetY = 0;
        PathfindingLogic instance = null;
        float expResult = 0.0F;
        float result = instance.estimateDistanceToTarget(positionX, positionY, targetX, targetY);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of run method, of class PathfindingLogic.
     */
    @Test
    public void testRun() {
        System.out.println("run");
        PathfindingLogic instance = null;
        instance.run();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printBestPath method, of class PathfindingLogic.
     */
    @Test
    public void testPrintBestPath() {
        System.out.println("printBestPath");
        PathfindingLogic instance = null;
        instance.printBestPath();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

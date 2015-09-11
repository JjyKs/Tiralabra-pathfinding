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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author jjyks
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({tiralabra.pathfinding.PathTest.class, tiralabra.pathfinding.NodeTest.class, tiralabra.pathfinding.MapTest.class, tiralabra.pathfinding.SortableNodeListTest.class, tiralabra.pathfinding.TiralabraPathfindingTest.class, tiralabra.pathfinding.PathfindingLogicTest.class})
public class PathfindingSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}

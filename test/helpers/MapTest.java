/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 *
 * @author JjyKs
 */
public class MapTest {

    /**
     * Test of getDistanceBetween method, of class Map.
     */
    @Test
    public void testGetDistanceBetween() {
        Map map = new Map();
        assertThat(32.0f, is(map.getDistanceBetween(map.nodes[1][1], map.nodes[1][2])));
        assertThat(54.4f, is(map.getDistanceBetween(map.nodes[1][1], map.nodes[2][2])));
    }

}

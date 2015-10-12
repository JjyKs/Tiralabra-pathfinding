package tiralabra.pathfinding;

import helpers.Map;
import tiralabra.pathfinding.algorithms.PathfindingLogic;

/**
 *
 * @author jjyks
 */
public class TiralabraPathfinding {

    public static void main(String[] args) {
        for (int i = 0; i < 256; i++) {
            Map map = new Map();
            PathfindingLogic pathFinder = new PathfindingLogic(map);

            pathFinder.run();
            pathFinder.printBestPath();
            System.out.println("");
            System.out.println("Run " + i);
        }
    }
}

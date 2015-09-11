package tiralabra.pathfinding;

/**
 *
 * @author jjyks
 */
public class TiralabraPathfinding {
    public static void main(String[] args) {
        Map map = new Map();
        PathfindingLogic pathFinder = new PathfindingLogic(map);

        pathFinder.run();
        pathFinder.printBestPath();
    }
}

package tiralabra.pathfinding;

import helpers.Map;
import tiralabra.pathfinding.algorithms.PathfindingLogic;
import tiralabra.pathfinding.algorithms.PathfindingLogicFullJavaVersion;
import tiralabra.pathfinding.algorithms.PathfindingLogicJavaArrayList;
import tiralabra.pathfinding.algorithms.PathfindingLogicJavaMinHeap;

/**
 *
 * @author jjyks
 */
public class TiralabraPathfinding {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 32; i++) {
            System.out.println("Run " + (i + 1));
            Map map;
            if (args.length == 0) {
                map = new Map();
            } else {
                map = new Map(Integer.parseInt(args[0]));
            }

            PathfindingLogic pathFinder = new PathfindingLogic(map);
            PathfindingLogicFullJavaVersion pathFinderJavaVersion = new PathfindingLogicFullJavaVersion(map);
            PathfindingLogicJavaArrayList pathFinderJavaArray = new PathfindingLogicJavaArrayList(map);
            PathfindingLogicJavaMinHeap pathFinderJavaMinHeap = new PathfindingLogicJavaMinHeap(map);

            long startTime = System.currentTimeMillis();
            pathFinder.run();
            System.out.println("Itsetehdyt tietorakenteet: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            pathFinderJavaVersion.run();
            System.out.println("Javan omat tietorakenteet: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            pathFinderJavaArray.run();
            System.out.println("Oma Minheap, Javan arraylist: " + (System.currentTimeMillis() - startTime));

            startTime = System.currentTimeMillis();
            pathFinderJavaMinHeap.run();
            System.out.println("Oma Arraylist, Javan minheap: " + (System.currentTimeMillis() - startTime));

            if (args.length == 2 && args[1].equals("-v")) {
                pathFinder.printBestPath();
            }
            System.out.println("");
        }
    }
}

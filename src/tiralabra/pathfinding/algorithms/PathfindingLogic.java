package tiralabra.pathfinding.algorithms;

import helpers.Map;
import helpers.Node;
import helpers.Path;
import java.util.ArrayList;
import java.util.PriorityQueue;
import tiralabra.pathfinding.datastructures.MinHeap;
import tiralabra.pathfinding.datastructures.SortableNodeList;

/**
 * Here's the a* algorithm
 * @author jjyks
 */
public class PathfindingLogic {

    private Map map;

    //private ArrayList<Node> searchedNodes;
    //private PriorityQueue<Node> openNodes;
    private SortableNodeList searchedNodes;
    private MinHeap openNodes;
    private Path bestPath;

    public PathfindingLogic(Map map) {
        this.map = map;
        //searchedNodes = new ArrayList();
        //openNodes = new PriorityQueue();
        searchedNodes = new SortableNodeList();
        openNodes = new MinHeap();
    }

    /**
     *
     * @param positionX positionX of our current tile
     * @param positionY positionY of our current tile
     * @param targetX positionX of our target tile
     * @param targetY positionY of our target tile
     * @return estimated distance
     */
    public float estimateDistanceToTarget(int positionX, int positionY, int targetX, int targetY) {
        float dx = targetX - positionX;
        float dy = targetY - positionY;
        return (float) (dx * dx) + (dy * dy);
    }

    /**
     * Here we loop through nodes and use the heuristics, check the actual java comments to figure out what we're doing.
     *
     */
    public void run() {
        map.nodes[map.startLocationX][map.startLocationY].distanceFromStart = 0;
        searchedNodes.clear();
        openNodes.clear();
        openNodes.add(map.nodes[map.startLocationX][map.startLocationY]);
        Node last = null;
        while (openNodes.size() != 0) {
            // here we get a first node sorted by the heuristics from the open list
            Node current = openNodes.peek();
            last = current;
            
            // check if we're on the target
            if (current.x == map.targetLocationX && current.y == map.targetLocationY) {
                break;
            }

            // lets move our current node to the closed list
            openNodes.remove(current);
            searchedNodes.add(current);

            //loop through all neighbours
            for (Node neighbour : current.neighbours) {
                boolean neighbourSeemsBetter;

                // We don't want to cause an infinite loop by checking same tile multiple times
                if (neighbour == null || searchedNodes.contains(neighbour)) {
                    continue;
                }

                //Right now we don't add weight to the calculations, everything over 1 weight is considered as an obstacle.
                if (neighbour.weight == 0) {
                    // calculate the paths length if we choose this neighbour
                    float neighborDistanceFromStart = (current.distanceFromStart + map.getDistanceBetween(current, neighbour));

                    //add neighbour to the open list if it's not there
                    if (!openNodes.contains(neighbour)) {
                        openNodes.add(neighbour);
                        neighbourSeemsBetter = true;
                    } else { //neighbour might be better if it's closer to the start
                        neighbourSeemsBetter = neighborDistanceFromStart < current.distanceFromStart;
                    }

                    if (neighbourSeemsBetter) {
                        neighbour.lastNode = current;
                        neighbour.distanceFromStart = neighborDistanceFromStart;
                        neighbour.distanceFromGoal = estimateDistanceToTarget(neighbour.x, neighbour.y, map.targetLocationX, map.targetLocationY);
                    }
                }

            }
        }
        constructPrintablePath(last);

    }

    /**
     * Prints the acquired path
     */
    public void printBestPath() {
        for (int x = 0; x < map.xSize; x++) {
            for (int y = 0; y < map.ySize; y++) {
                Node node = map.nodes[x][y];
                if (node.start) {
                    System.out.print("S");
                } else if (node.target) {
                    System.out.print("T");
                } else if (bestPath != null && bestPath.contains(node.x, node.y)) {
                    System.out.print("x");
                } else if (searchedNodes != null && searchedNodes.contains(node)) {
                    System.out.print("░");
                } else {
                    if (node.weight != 0) {
                        System.out.print("▓");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /**
     * This method constructs the path from nodes by traversing back one by one.
     * @param node The last node we reached 
     */
    private void constructPrintablePath(Node node) {
        Path path = new Path();
        while (node.lastNode != null) {
            path.AddPathNodeToStart(node);
            node = node.lastNode;
        }
        this.bestPath = path;
    }
}

package tiralabra.pathfinding;

/**
 * Simple model containing 10000 places for nodes. The indexing starts from 5000. You can add maximum of 5000 nodes to the end and start of this array.
 * @author jjyks
 */
public class Path {
    private Node[] pathNodes = new Node[10000];
    private int pathNodesPointer = 5000;
    private int pathNodesOffset = 0;
   
    /**
     *
     * @param n Add this note to the end of our path
     */
    public void addPathNodeToEnd(Node n) {
        pathNodes[pathNodesPointer] = n;
        pathNodesPointer++;
    }

    /**
     *
     * @param n Add this note to the start of our path
     */
    public void AddPathNodeToStart(Node n) {
        pathNodesOffset--;
        pathNodes[5000-pathNodesOffset] = n;
    }
    
    /**
     *
     * @param x xPosition of the node
     * @param y yPosition of the node
     * @return does the path contain this node
     */
    public boolean contains(int x, int y) {
        for (Node node : pathNodes) {
            if (node != null && node.x == x && node.y == y) {
                return true;
            }
        }
        return false;
    }
}

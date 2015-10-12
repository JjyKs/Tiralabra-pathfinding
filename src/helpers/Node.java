package helpers;

/**
 * Node class holding information about neighbours, weight of itself, the node
 * we came here from, visited status etc.
 *
 * @author jjyks
 */
public class Node implements Comparable<Node> {

    public Map map;
    public Node[] neighbours;
    public boolean visited;
    public float distanceFromStart;
    public float distanceFromGoal;
    public Node lastNode;
    public int x, y, weight;
    public boolean start, target;

    public Node(int weight, int x, int y) {
        neighbours = new Node[8];
        this.x = x;
        this.y = y;
        this.visited = false;
        this.distanceFromStart = Integer.MAX_VALUE;
        this.start = false;
        this.target = false;
        this.weight = weight;
    }

    /**
     * X is this node, numbers are positions of neighbours
     *
     * 8 1 2
     * 7 X 3
     * 6 5 4
     *
     * @param position where is that neighbour. Consult the image above to
     * understand the numbers
     */
    public Node getNeighbour(int position) {
        return neighbours[position];
    }

    /**
     * X is this node, numbers are positions of neighbours
     *
     * 8 1 2
     * 7 X 3
     * 6 5 4
     *
     * @param position Where is that neighbour. Consult the image above to
     * understand the numbers
     * @param node The node you want to set to the given position
     */
    public void setNeighbour(int position, Node node) {
        neighbours[position - 1] = node;
    }

    /**
     *
     * @param node
     * @return
     *
     */
    public boolean equals(Node node) {
        return node.y == y && node.x == x;
    }

    /**
     *
     * @param otherNode The node your are comparing this one to
     * @return -1 if this one smaller, 0 if same and 1 if bigger
     */
    @Override
    public int compareTo(Node otherNode) {
        if (otherNode == null) {
            return 0;
        }
        float selfDistanceFromGoal = distanceFromGoal + distanceFromStart;
        float otherDistanceFromGoal = otherNode.distanceFromGoal + otherNode.distanceFromStart;

        if (selfDistanceFromGoal < otherDistanceFromGoal) {
            return -1;
        } else if (selfDistanceFromGoal > otherDistanceFromGoal) {
            return 1;
        } else {
            return 0;
        }
    }
}

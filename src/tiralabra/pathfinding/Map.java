package tiralabra.pathfinding;

/**
 * Holds information about map. 
 * @author jjyks
 */
public class Map {

    final int xSize = 16;
    final int ySize = 16;
    Node[][] nodes;

    final int startLocationX = 0;
    final int startLocationY = 0;
    final int targetLocationX = 15;
    final int targetLocationY = 15;

    Map() {
        generateMap();
        setNeighbours();
    }
    /**
     * Generates an array of nodes and obstacles
     */
    private void generateMap() {
        Node node;
        nodes = new Node[xSize][ySize];
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                node = new Node(0, x, y);
               
                if (x >= 0 && x < 14 && y == 3){
                    node.weight = 1;
                }
                if (x >= 2 && x < 16 && y == 5){
                    node.weight = 1;
                }
                if (x >= 0 && x < 14 && y == 7){
                    node.weight = 1;
                }
                if (x >= 10 && x < 14 && y == 9){
                    node.weight = 1;
                }
                if (x <= 8 && y == 9){
                    node.weight = 1;
                }
                if (x == 7 && y > 9 && y < 10){
                    node.weight = 1;
                }
                if (x == 7 && y > 11 && y < 14){
                    node.weight = 1;
                }
                if (x == 7 && y > 9 && y < 11){
                    node.weight = 1;
                }

                if (x == 11 && y > 9 && y < 14){
                    node.weight = 1;
                }
                if (x > 7 && x <16 && y == 13){
                    node.weight = 1;
                }
                
                
                

                nodes[x][y] = node;
            }
        }
        nodes[startLocationX][startLocationX].start = true;
        nodes[targetLocationX][targetLocationY].target = true;
    }

    /**
     * Tells every node its neighbouring nodes
     */
    private void setNeighbours() {
        for (int x = 0; x < xSize - 1; x++) {
            for (int y = 0; y < ySize - 1; y++) {
                Node node = nodes[x][y];
                if (!(x == 0) && y != ySize) {
                    node.setNeighbour(8, nodes[x - 1][y + 1]);
                }
                if (!(x == 0)) {
                    node.setNeighbour(7, nodes[x - 1][y]);
                }
                if (!(x == 0) && !(y == 0)) {
                    node.setNeighbour(6, nodes[x - 1][y - 1]);
                }
                if (y != 0) {
                    node.setNeighbour(5, nodes[x][y - 1]);
                }
                if (y != 0 && x != xSize) {
                    node.setNeighbour(4, nodes[x + 1][y - 1]);
                }
                if (x != xSize) {
                    node.setNeighbour(3, nodes[x + 1][y]);
                }
                if (x != xSize && y != ySize) {
                    node.setNeighbour(2, nodes[x + 1][y + 1]);
                }
                if (y != ySize) {
                    node.setNeighbour(1, nodes[x][y + 1]);
                }

            }
        }
    }

    /**
     *
     * @param node1 first node
     * @param node2 second node
     * @return a distance between given nodes
     */
    public float getDistanceBetween(Node node1, Node node2) {
        if (node1.x == node2.x || node1.y == node2.y) {
            return ySize + xSize;
        } else {
            return (float) 1.7 * (ySize + xSize);
        }
    }
}

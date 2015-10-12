package helpers;

import helpers.Node;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Holds information about map.
 *
 * @author jjyks
 */
public class Map {

    public int xSize = 96;
    public int ySize = xSize;
    public Node[][] nodes;
    public int startLocationX = 0;
    public int startLocationY = 0;
    public int targetLocationX = 15;
    public int targetLocationY = 15;

    /**
     *
     * @param mapSize
     */
    public Map(int mapSize) {
        xSize = mapSize;
        ySize = mapSize;
        generateMap();
        setNeighbours();
    }

    /**
     *
     */
    public Map() {
        generateMap();
        setNeighbours();
    }

    /**
     * Generates an array of nodes and obstacles
     */
    private void generateMap() {
        nodes = new Node[xSize][ySize];

        generateRandomMap();
        startLocationX = ThreadLocalRandom.current().nextInt(0, xSize - 1);
        startLocationY = ThreadLocalRandom.current().nextInt(0, xSize - 1);
        targetLocationX = ThreadLocalRandom.current().nextInt(0, xSize - 1);
        targetLocationY = ThreadLocalRandom.current().nextInt(0, xSize - 1);
        nodes[startLocationX][startLocationY].start = true;
        nodes[targetLocationX][targetLocationY].target = true;
        nodes[startLocationX][startLocationX].weight = 0;
        nodes[targetLocationX][targetLocationY].weight = 0;
        System.out.println("Map generated");
    }

    private void generateRandomMap() {
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                Node node = new Node(0, x, y);
                node.weight = ThreadLocalRandom.current().nextInt(0, 10) / 5;
                nodes[x][y] = node;
            }
        }
    }

    private void generateOldMap() {
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                Node node = new Node(0, x, y);

                if (x >= 0 && x < 14 && y == 3) {
                    node.weight = 1;
                }
                if (x >= 2 && x < 16 && y == 5) {
                    node.weight = 1;
                }
                if (x >= 0 && x < 14 && y == 7) {
                    node.weight = 1;
                }
                if (x >= 10 && x < 14 && y == 9) {
                    node.weight = 1;
                }
                if (x <= 8 && y == 9) {
                    node.weight = 1;
                }
                if (x == 7 && y > 9 && y < 10) {
                    node.weight = 1;
                }
                if (x == 7 && y > 11 && y < 14) {
                    node.weight = 1;
                }

                if (x == 11 && y > 9 && y < 14) {
                    node.weight = 1;
                }

                nodes[x][y] = node;
            }
        }
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

   
    public float getDistanceBetween(Node node1, Node node2) {

        return 1;

    }
}

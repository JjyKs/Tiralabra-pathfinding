package tiralabra.pathfinding.datastructures;

import helpers.Node;

/**
 * Simple arraylist implementation
 *
 * @author jjyks
 */
public class SortableNodeList {

    private Node[] listOfNodes;
    private int index;
    private int values;

    public SortableNodeList() {
        listOfNodes = new Node[20];
        index = 0;
        values = 0;
    }

    /**
     * Adds node to the list
     *
     *
     * @param n
     */
    public void add(Node n) {
        if (index < listOfNodes.length) {
            values++;
            listOfNodes[index] = n;
            index++;
        } else {
            addSlotsToList(listOfNodes);
            add(n);
        }
    }

    private void addSlotsToList(Node[] listOfNodes) {
        Node[] tempList = new Node[listOfNodes.length + listOfNodes.length / 2];
        for (int i = 0; i < this.listOfNodes.length; i++) {
            tempList[i] = this.listOfNodes[i];
        }
        this.listOfNodes = tempList;
    }

    public Node get(int i) {
        if (i >= listOfNodes.length) {
            return null;
        }
        return listOfNodes[i];
    }

    public void remove(int i) {
        if (values != 0) {
            listOfNodes[i] = null;
            values--;
            index--;
        }
    }

    public Node getFirst() {
        return listOfNodes[0];
    }

    public void remove(Node n) {
        int o = 0;
        if (values != 0) {
            values--;
            index--;
            for (int i = 0; i < values; i++) {
                if (listOfNodes[i].equals(n)) {
                    listOfNodes[i] = null;
                }
                o = i;
                i += listOfNodes.length;
            }
            for (int i = o; i < listOfNodes.length - 1; i++) {
                listOfNodes[i] = listOfNodes[i + 1];
            }
        }
    }

    /**
     * Checks if list contains the node
     *
     * @param n
     * @return
     */
    public boolean contains(Node n) {
        if (values != 0) {
            for (int i = (listOfNodes.length - 1); i >= 0; i--) {
                if (listOfNodes[i] != null && n.equals(listOfNodes[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    public int getPosition(Node n) {
        for (int i = 0; i < listOfNodes.length; i++) {
            if (listOfNodes[i] == n) {
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    public void clear() {
        listOfNodes = new Node[20];
    }

    public int size() {
        return values;
    }

    public void set(int i, Node n) {
        listOfNodes[i] = n;
    }

    public boolean isEmpty() {
        if (values == 0) {
            return true;
        }
        return false;
    }
}

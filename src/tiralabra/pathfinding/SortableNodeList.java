package tiralabra.pathfinding;
/**
 * Placeholder model to replicate couple arraylist methods. Not fully commented since we're not gonna keep using this.
 * @author jjyks
 */

class SortableNodeList {
        private Node[] list = new Node[0];

        public Node getFirst() {
            return list[0];
        }

        public void clear() {
            list = new Node[0];
        }

        public void add(Node node) {
            if (this.size() == 0) {
                list = new Node[this.size() + 1];
                list[0] = node;
            } else {
                Node[] newList = new Node[this.size() + 1];
                int offset = 0;
                for (int i = 0; i < this.size(); i++) {
                    if (node != null && (node.compareTo(list[i]) == -1 || node.compareTo(list[i]) == 0)) {
                        newList[i] = node;
                        node = null;
                        offset++;
                        newList[i + offset] = list[i];
                    } else {
                        newList[i + offset] = list[i];
                    }
                }
                if (node != null) {
                    newList[newList.length - 1] = node;
                }
                list = newList;
            }
        }

        public void remove(Node n) {
            for (int i = 0; i < list.length; i++) {
                if (list[i] == n) {
                    for (int u = 0; i + u < list.length - 1; u++) {
                        list[i + u] = list[i + u + 1];
                    }
                    break;
                }
            }
        }

        public int size() {
            int amountOfNodes = 0;
            for (Node n : list) {
                if (n != null) {
                    amountOfNodes++;
                }
            }
            return amountOfNodes;
        }

        public boolean contains(Node n) {
            for (Node node : list) {
                if (n == node) {
                    return true;
                }
            }
            return false;
        }
    }
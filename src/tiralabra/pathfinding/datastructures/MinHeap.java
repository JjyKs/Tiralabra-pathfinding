package tiralabra.pathfinding.datastructures;

import helpers.Node;

/**
 *
 * @author jjyks
 */
public class MinHeap {

    private SortableNodeList heap;

    public MinHeap() {
        heap = new SortableNodeList();
    }

    /**
     * Adds node to the heap
     *
     * @param node
     */
    public void add(Node node) {
        heap.add(node);
        int slot = heap.size() - 1;
        if (heap.isEmpty()) {
            heap.add(node);
            return;
        }
        while (slot >= 0 && slot < heap.size() && node.compareTo(heap.get(parent(slot))) < 0) {
            swap(slot, parent(slot));
            slot = parent(slot);
        }
    }

    /**
     * Removes the first node
     *
     * @return
     */
    public void remove() {
        if (heap.isEmpty()) {
        } else {
            Node n = heap.get(0);
            heap.set(0, heap.get(heap.size() - 1));
            heap.remove(heap.size() - 1);
            heapify(0);
        }
    }
    
    public void remove(Node n){
        int nPos = heap.getPosition(n);
        heap.remove(n);
        heapify(nPos);
    }

    public Node peek() {
        return heap.get(0);
    }

    public int size() {
        return heap.size();
    }

    public boolean isEmpty() {
        return heap.isEmpty();
    }

    public boolean contains(Node n) {
        for (int i = 0; i < heap.size(); i++) {
            if (heap.get(i).equals(n)) {
                return true;
            }
        }
        return false;

    }

    public void clear() {
        heap = new SortableNodeList();
    }

    private int left(int i) {
        return 2 * i + 1;
    }

    private int right(int i) {
        return 2 * i + 2;
    }

    private int parent(int i) {
        return (i - 1) / 2;
    }

    private void heapify(int i) {
        int leftChild = left(i);
        int rightChild = right(i);
        int smallest;

        if (leftChild >= 0 && leftChild < heap.size() && heap.get(leftChild).compareTo(heap.get(i)) < 0) {
            smallest = leftChild;
        } else {
            smallest = i;
        }
        if (rightChild >= 0 && rightChild <= heap.size() - 1 && heap.get(rightChild).compareTo(heap.get(smallest)) < 0) {
            smallest = rightChild;
        }
        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    private void swap(int i, int j) {
        Node n = heap.get(i);
        heap.set(i, heap.get(j));
        heap.set(j, n);
    }
}

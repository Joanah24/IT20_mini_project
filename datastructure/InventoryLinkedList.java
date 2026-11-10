package datastructure;

import model.Product;

public class InventoryLinkedList {
    private InventoryNode head;
    private int size;

    public InventoryLinkedList() {
        this.head = null;
        this.size = 0;
    }

    // ADD PRODUCT
    public void addProduct(Product product) {
        InventoryNode newNode = new InventoryNode(product);

        if (head == null) {
            head = newNode;
        } else {
            InventoryNode current = head;

            while (current.next != null) {
                current = current.next;
            }

            current.next = newNode;
        }

        size++;
    }
}
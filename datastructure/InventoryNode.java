package datastructure;

import model.Product;

public class InventoryNode {
    public Product product; // Holds the Product object (Parent or Child)
    public InventoryNode next; 

    
    public InventoryNode(Product product) {
        this.product = product;
        this.next = null;
    }
}
package datastructure;

import model.Product;

public class InventoryLinkedList {
    private InventoryNode head;
    private int size;

   
    public InventoryLinkedList() {
        this.head = null;
        this.size = 0;
    }

    //  ADD / INSERT OPERATION 
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

  
    public Product searchByName(String targetName) {
        if (targetName == null || head == null) {
            return null;
        }
        
        InventoryNode current = head;
        String cleanTarget = targetName.trim();

       
        while (current != null) {
            if (current.product.getName().equalsIgnoreCase(cleanTarget)) {
                return current.product;
            }
            current = current.next;
        }
        
        return null; 
    }

    
    public boolean updateStockByName(String targetName, int newStockQuantity) {
        Product foundProduct = searchByName(targetName);
        if (foundProduct != null) {
            foundProduct.setStockQuantity(newStockQuantity);
            return true;
        }
        return false; 
    }

    
    public Product[] getAllProductsArray() {
        Product[] productArray = new Product[size];
        InventoryNode current = head;
        int index = 0;
        
        while (current != null) {
            productArray[index++] = current.product;
            current = current.next;
        }
        
        return productArray;
    }

    
    public boolean isEmpty() {
        return head == null;
    }

    
    public int size() {
        return size;
    }
}
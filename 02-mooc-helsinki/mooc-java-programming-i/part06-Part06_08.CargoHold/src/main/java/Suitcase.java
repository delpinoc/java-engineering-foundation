/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jedcm
 */
import java.util.ArrayList;

public class Suitcase {
    
    private ArrayList<Item> items;
    private int maxWeight;
    
    public Suitcase(int maxWeight) {
        this.items = new ArrayList<>();
        this.maxWeight = maxWeight;
    }
    
    public void addItem(Item item) {
        if (hasSpaceFor(item)) {
            this.items.add(item);
        }
    }
    
    public int totalWeight() {
        int currentTotalWeight = 0;
        for (Item item: this.items) {
            currentTotalWeight += item.getWeight();
        }
        return currentTotalWeight;
    }
    
    private boolean hasSpaceFor(Item item) {
        int availableSpace = this.maxWeight - totalWeight();
        return item.getWeight() <= availableSpace;
    }
    
    @Override
    public String toString() {
        if (this.items.size() == 0) {
            return "no items (" + totalWeight() + " kg)";
        }
        
        if (this.items.size() == 1) {
            return this.items.size() + " item (" + totalWeight() + " kg)";
        }
        return this.items.size() + " items (" + totalWeight() + " kg)";
    }
    
    public void printItems() {
        for (Item item: this.items) {
            System.out.println(item.getName() + "(" + item.getWeight() + " kg)");
        }
    }
    
    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }
        
        Item returnObject = this.items.get(0);
        
        for (Item item: this.items) {
            if (item.getWeight() >= returnObject.getWeight()) {
                returnObject = item;
            }
        }
        
        return returnObject;
    }
    
}

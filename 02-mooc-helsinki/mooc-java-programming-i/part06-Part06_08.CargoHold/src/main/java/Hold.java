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

public class Hold {

    private ArrayList<Suitcase> suitcases;
    private int maxWeight;

    public Hold(int maxWeight) {
        this.suitcases = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase) {
        if (hasSpaceFor(suitcase)) {
            this.suitcases.add(suitcase);
        }
    }

    private boolean hasSpaceFor(Suitcase suitcase) {
        int availableSpace = this.maxWeight - this.totalWeight();
        return suitcase.totalWeight() <= availableSpace;
    }

    public int totalWeight() {
        int currentTotalWeight = 0;
        for (Suitcase suitcase : this.suitcases) {
            currentTotalWeight += suitcase.totalWeight();
        }
        return currentTotalWeight;
    }

    @Override
    public String toString() {
        return this.suitcases.size() + " suitcases (" + totalWeight() + " kg)";
    }

    public void printItems() {
        for (Suitcase suitcase : this.suitcases) {
            suitcase.printItems();
        }
    }

}

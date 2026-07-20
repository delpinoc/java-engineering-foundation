/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jedcm
 */
public class Container {

    private int liters;

    public Container() {
        liters = 0;
    }

    public int contains() {
        return liters;
    }

    public void add(int amount) {
        int freeSpace = 100 - liters;

        if (amount > 0) {
            if (amount > freeSpace) {
                liters = 100;
            } else {
                liters += amount;
            }
        }
    }
    
    public void move(int amount, Container obj) {
        if (amount > 0 && this.liters > 0) {
            if (amount < this.liters) {
                this.liters -= amount;
                obj.add(amount);
            } else if (amount >= this.liters) {
                obj.add(this.liters);
                this.liters = 0;
            }
            
            if (obj.contains() > 100) {
                obj.add(100);
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (amount >= liters) {
                liters -= liters;
            } else {
                liters -= amount;
            }
        }
    }

    @Override
    public String toString() {
        return liters + "/" + 100;
    }

}

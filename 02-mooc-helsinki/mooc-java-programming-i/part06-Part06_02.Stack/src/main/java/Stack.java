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

public class Stack {

    private ArrayList<String> lista;

    public Stack() {
        this.lista = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        if (this.lista.size() == 0) {
            return true;
        }
        return false;
    }
    
    public void add(String value) {
        this.lista.add(0, value);
    }
    
    public ArrayList<String> values() {
        return this.lista;    
    }
    
    public String take() {
        int topmostIndex = 0;
        String taken = this.lista.remove(topmostIndex);
        return taken;
    }

}

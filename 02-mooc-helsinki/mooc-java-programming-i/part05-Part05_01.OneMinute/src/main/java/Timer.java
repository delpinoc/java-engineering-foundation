/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jedcm
 */
public class Timer {
    private ClockHand centesimas;
    private ClockHand segundos;
    
    public Timer() {
        this.centesimas = new ClockHand(100);
        this.segundos = new ClockHand(60);
    }
    
    public void advance() {
        this.centesimas.advance();
        
        if (this.centesimas.value() == 0) {
            this.segundos.advance();
        }
    }
    
    @Override
    public String toString() {
        String formato = "";
        if (this.segundos.value() < 10) {
            formato += "0" + this.segundos.value();
        } else {
            formato = String.valueOf(this.segundos.value());
        }
        
        formato += ":";
        
        if (this.centesimas.value() < 10) {
            formato += "0" + this.centesimas.value();
        } else {
            formato += String.valueOf(this.centesimas.value());
        }
        return formato;
    }
    
    
}

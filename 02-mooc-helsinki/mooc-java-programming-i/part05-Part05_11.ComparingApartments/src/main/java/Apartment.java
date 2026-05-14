
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int priceAp1 = this.squares * this.princePerSquare;
        int priceAp2 = compared.squares * compared.princePerSquare;
        
        int difference = priceAp1 - priceAp2;
        
        if (difference < 0) {
            return difference * -1;
        }
        return difference;
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int priceAp1 = this.squares * this.princePerSquare;
        int priceAp2 = compared.squares * compared.princePerSquare;
        
        if (priceAp1 > priceAp2) {
            return true;
        }
        
        return false;
    }

}


public class Apartment {

    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (squares > compared.squares ) {
            return true;
        }
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int differenceValue = (pricePerSquare * squares) - (compared.pricePerSquare * compared.squares);
        if (differenceValue < 0) {
            differenceValue = differenceValue * -1;
        }
        
        return differenceValue; 
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        if ((pricePerSquare * squares) > (compared.pricePerSquare * compared.squares)) {
            return true;
        }
        return false;
    }
}

import java.util.ArrayList;

public class Package {
    
    private ArrayList<Gift> gifts;
    
    public Package(){
        this.gifts = new ArrayList();
    }
    
    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }
    
    public int totalWeight() {
        int sumOfWeights = 0;
        for (Gift g : gifts) {
            sumOfWeights += g.getWeight();
        }
        return sumOfWeights;
    }
}

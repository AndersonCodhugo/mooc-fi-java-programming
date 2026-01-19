
import java.util.ArrayList;

public class Hold {
    private int maximumWeight;
    private ArrayList<Suitcase> suitcases;
    
    public Hold(int maximumWeight) {
        this.maximumWeight = maximumWeight;
        this.suitcases = new ArrayList();
    }
    
    public int currentWeight(){
        int currentWeight = 0;
        for(Suitcase s : suitcases){
            currentWeight += s.totalWeight();
        }
        return currentWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        if (this.currentWeight() + suitcase.totalWeight() <= this.maximumWeight) {
            this.suitcases.add(suitcase);
        }
    }
    
    public String toString() {
        return this.suitcases.size() + " suitcases " + "(" + this.currentWeight() + " kg)";
    }
    
    public void printItems() {
        for (Suitcase suitc : this.suitcases) {
            suitc.printItems();
        }
    }
}


import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    @Override
    public String toString() {
        
        String printOutput = "";
        
        if (this.elements.isEmpty()) {
            printOutput =  "The collection " + this.name + " is empty.";
            return printOutput;
        }
        else if (this.elements.size() == 1) {
            printOutput = "The collection " + this.name + " has " + this.getElements().size() + " element:" + "\n" + this.elements.get(0);
            return printOutput;
            }
            else {
            String items = "";
            printOutput = "The collection " + this.name + " has " + this.getElements().size() + " elements:\n";
            for(String e : elements){
                items = items + e + "\n";
            }
            return printOutput + items;
        }
    }
    
}

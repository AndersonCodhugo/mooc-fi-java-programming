
import java.util.ArrayList;

public class BirdManager {
    private ArrayList<Bird> birds;
    
    public BirdManager() {
        this.birds = new ArrayList<>();
    }
    
    public void add(String name, String latimName) {
        
        Bird newBird = new Bird(name, latimName);
        this.birds.add(newBird);
    }
    
    public void addObservation(String name) {
        for (Bird bird : birds) {
            if (bird.getBirdName().equals(name)) {
                bird.addObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void printAll() {
        for (Bird bird : birds) {
            System.out.println(bird);
        }
    }
    
    public void printOne(String name) {
        for (Bird bird : birds) {
            if (bird.getBirdName().equals(name)) {
                System.out.println(bird);
                return;
            }
        }
        System.out.println("Not a bird!");
    }
    
}

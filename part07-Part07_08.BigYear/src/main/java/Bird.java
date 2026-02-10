public class Bird {

    private String birdName;
    private String latinName;
    private int observations;
    
    public Bird (String birdName, String latinName) {
        this.birdName = birdName;
        this.latinName = latinName;
    }
    
    public void addObservation() {
        this.observations++;
    }

    public String getBirdName() {
        return birdName;
    }

    public String toString() {
        return birdName + " (" + latinName + "): " + observations + " observations" ;
    }
}

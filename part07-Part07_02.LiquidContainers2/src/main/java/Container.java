public class Container {
    private int capacity;
    private int amount;

    public Container() {
        this.capacity = 100;
        this.amount = amount;
    }

    
    public int contains() {
        return this.amount;
    }
    
    public void add(int amount) {
        if (amount + this.amount > this.capacity)
            this.amount = this.capacity;
        else if (amount > 0){
            this.amount += amount;
        }
    }
    
    public void remove(int amount) {
        if (amount > this.amount) {
            this.amount = 0;
        }
        else if (amount > 0) {
            this.amount -= amount;
        }
    }
    
    public String toString() {
        return this.amount + "/" + this.capacity;
    }
}

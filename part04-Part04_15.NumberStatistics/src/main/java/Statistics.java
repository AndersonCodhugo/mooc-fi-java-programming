
public class Statistics {
    
    private int count;
    private int sum;
    
    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }
    public void addNumber(int number) {
        this.sum = this.sum + number;
        this.count++;
    }
    public int getCount() {
        return this.count;
    }
    public int sum() {
        if (this.count == 0) {
            return 0;
        } else {
            return this.sum;
        }
    }
    public double average() {
        double average;
        if (this.count == 0) {
            average = 0;
        } else {
            average = (double) this.sum / this.count;
        }

        return average;
    }
}

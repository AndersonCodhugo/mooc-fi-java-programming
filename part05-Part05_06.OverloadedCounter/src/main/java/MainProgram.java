
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        Counter counter = new Counter(10);
        
        counter.decrease();
        counter.decrease(2);
        
        System.out.println(counter.getValue());
        
        counter.increase();
        counter.increase(12);
        
        System.out.println(counter.getValue());
    }
}

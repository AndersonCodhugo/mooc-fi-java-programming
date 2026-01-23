
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {
    private ArrayList<String> jokes; 

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }
    
    public void addJoke(String joke) {
        this.jokes.add(joke);
    }
    
    public String drawJoke() {
        if (this.jokes.isEmpty()){
            return "Jokes are in short supply.";
        }
        Random rand = new Random();
        int randomJokeIndex = rand.nextInt(this.jokes.size());
        return this.jokes.get(randomJokeIndex);
    }
    
    public void printJokes() {
        for (int i = 0; i < this.jokes.size(); i++) {
            System.out.println(this.jokes.get(i));
        }
    }
}

public class Recipe {
    private String name;
    private int cookingTime;

    public Recipe(String name, int cookingTime) {
        this.name = name;
        this.cookingTime = cookingTime;
    }

    @Override
    public String toString() {
        return name + ", cooking time: " + cookingTime;
    }
    
    
}

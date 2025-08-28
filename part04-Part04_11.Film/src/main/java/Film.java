public class Film {
    private String name;
    private int ageRating;
    
    public Film(String name, int filmAgeRating) {
        this.name = name;
        this.ageRating = filmAgeRating;
    }
    public String name() {
        return name;
    }
    public int ageRating() {
        return ageRating;
    }
}

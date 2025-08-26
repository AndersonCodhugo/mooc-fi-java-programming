
public class StarSign {

    public static void main(String[] args) {

        printTriangle(4);
    }

    public static void printStars(int number) {
        
        int stars = 0;
        while (number > stars ) {
            System.out.print("*");
            stars++;
        }
        System.out.println("");
    }

    public static void printSquare(int size) {
        
        int counter = 0;
        while (counter < size) {
            printStars(size);
            counter++;
        }
        
    }

    public static void printRectangle(int width, int height) {
        int count = 0;
        while (count < height) {
            printStars(width);
            count++;
        }
    }

    public static void printTriangle(int size) {
        
        int count = 1 ;
        while (size >= count) {
            printStars(count);
            count++;
        }
    }
}

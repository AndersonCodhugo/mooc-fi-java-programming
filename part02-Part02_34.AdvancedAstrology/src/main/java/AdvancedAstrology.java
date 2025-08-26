
public class AdvancedAstrology {

    public static void printStars(int number) {
        int stars = 0;
        while (number > stars) {
            System.out.print("*");
            stars++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        int value = 0;
        int count = number - value;
        while (value < number) {
            System.out.print(" ");
            value++;
        }

    }

    public static void printTriangle(int size) {
        int count = 1;
        while (size >= count) {
            printSpaces(size - count);
            printStars(count);
            count++;
        }
    }

    public static void christmasTree(int height) {
        int i = 1;
        while (i <= height) {
            printSpaces(height - i);
            printStars(2 * i - 1);
            i++;
        }

        int trunkSpaces = height - 2;

        printSpaces(trunkSpaces);
        printStars(3);

        printSpaces(trunkSpaces);
        printStars(3);
    }

    public static void main(String[] args) {

        christmasTree(10);
    }
}

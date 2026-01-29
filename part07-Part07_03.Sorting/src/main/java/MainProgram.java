
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] numbers = {6, 5, 8, 7, 11};
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int i = 0; i < array.length; i++) {
            if ( array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }
}

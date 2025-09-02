import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Books> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Title: ");
            String title = String.valueOf(scanner.nextLine());
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            
            System.out.println("Year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            books.add(new Books(title, pages, year));
        }
        
        System.out.println("What information will be printed? ");
        String input = String.valueOf(scanner.nextLine());
        
        for (Books book : books) {
            if (input.equals("everything")) {
                System.out.println(book);
            }
            else if (input.equals("name")) {
                System.out.println(book.getTitle());
            }
        }
    }
}

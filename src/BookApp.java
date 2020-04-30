/**
 * Main class to run the program
 */

public class BookApp {
    public static void main (String [] args) {

        //create a new object book1
        Book book1 = new Book();

        //since variables are private, use setter to
        //assign values
        book1.setTitle ("Revenge");
        book1.setAuthor ("Chris Tucker");
        book1.setDescription ("Action book");

        //Display the title, author and description
        //using a getDisplayText method
        book1.getDisplayText();

        System.out.println(" ");
        //the three variables can also be display
        //using getters for each variables
        System.out.println(book1.getAuthor());
        System.out.println(book1.getTitle());
        System.out.println(book1.getDescription());

    }
}

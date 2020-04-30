/**
 * Book class to create and save books variables
 * default constructor, overloaded constructor
 * getters and setters, and display method
 */
public class Book {

    //Declaration of the private variables
    private String title;
    private String author;
    private String description;
    private double price;
    private boolean isInStock;

    //Default constructor
    Book() { }
    //Overloaded constructor
    Book(String author, String title, String description, double price, boolean isInStock) {
        this.author = author;
        this.title = title;
        this.description = description;
        this.price = price;
        this.isInStock = isInStock;
    }

    //getters and setters for each variable
    public String getTitle() {
        return title;
    }
    public void setTitle (String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor (String author) {
        this.author = author;
    }
    public String getDescription () {
        return description;
    }
    public void setDescription (String description) {
        this.description = description;
    }
    public double getPrice () {
        return price;
    }
    public void setPrice (double price) {
        this.price = price;
    }
    public boolean getIsInStock () {
        return isInStock;
    }
    public void setIsInStock (boolean isInStock) {
        this.isInStock = isInStock;
    }


    //void method to display the book author
    //the book title and the book description
    public void getDisplayText() {
        System.out.println("Book Author: " + author);
        System.out.println("Book Title: " + title);
        System.out.println("Book description: " + description);
    }

}


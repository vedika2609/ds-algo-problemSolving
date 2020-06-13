package corejavaandcollections.oopsconcept;

/**
 * Created by vedikagupta on 11/06/20
 */

public class MyBook extends Book {

    private int price;

    private MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;

    }

    public static void main(String[] args) {
        MyBook myBook = new MyBook("The Alchemist", "Paulo Coelho", 248);
        myBook.display();
    }

    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

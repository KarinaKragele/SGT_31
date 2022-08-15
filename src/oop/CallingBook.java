package oop;


public class CallingBook {
    public static void main(String[] args){

        //Create Book class object
        Book book1 = new Book();
        book1.printBookInfo();

        book1.setTitle("Test title");
        book1.setAuthor("test author");
        book1.setNumberOfPages(10);

        book1.printBookInfo();

        Book book2 = new Book();
        book2.setTitle("Book 2");
        book2.setAuthor("Unknown");
        book2.setNumberOfPages(200);
        book2.printBookInfo();
    }
}

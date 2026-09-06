import librarymanagement.Book;
import librarymanagement.Library;
import librarymanagement.Member;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Book book = new Book("Harry Potter","JK Rowling");
        Library library = new Library();
        library.addBook(book);

//        String bookId = book.getBookId();
//        library.removeBook(bookId);


        Member member = new Member("Aparajit");

        library.bookExists(book,member);
    }
}
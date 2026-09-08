import librarymanagement.Book;
import librarymanagement.Library;
import librarymanagement.Member;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        Book book = new Book("Harry Potter","JK Rowling");
//        Library library = new Library();
//        library.addBook(book);
//
////        String bookId = book.getBookId();
////        library.removeBook(bookId);
//
//
//        Member member = new Member("Aparajit");
//
//        library.bookExists(book,member);


        // ===========================================================

// ==========================================
// TEST 1: Borrow a book that does not exist
// ==========================================

        Library library = new Library();

        Book book = new Book("Dune", "Frank Herbert");
        Member member = new Member("Aparajit");

        if(library.bookExists(book, member)){
            System.out.println("Book exists");
        }else{
            System.out.println("Book doesnt exists");
        }

    }
}
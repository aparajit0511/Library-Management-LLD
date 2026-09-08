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
// TEST 1: Borrow a book that does not exist -> runs fine
// ==========================================

//        Library library = new Library();
//
//        Book book = new Book("Dune", "Frank Herbert");
//        Member member = new Member("Aparajit");
//
//        if(library.bookExists(book, member)){
//            System.out.println("Book exists");
//        }else{
//            System.out.println("Book doesnt exists");
//        }

// ==========================================
// TEST 2: Borrow same book twice
// ==========================================

        Library library = new Library();

        Book book = new Book("Dune", "Frank Herbert");

        Member member1 = new Member("Aparajit");
        Member member2 = new Member("Rahul");

        library.addBook(book);

        boolean firstBorrow = library.bookExists(book, member1);
        boolean secondBorrow = library.bookExists(book, member2);

        System.out.println("First borrow: " + firstBorrow);
        System.out.println("Second borrow: " + secondBorrow);

        if (firstBorrow && !secondBorrow) {
            System.out.println("PASS: Book cannot be borrowed twice");
        } else {
            System.out.println("FAIL: Book was allowed to be borrowed twice");
        }
    }
}
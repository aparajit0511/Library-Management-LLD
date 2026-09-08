package librarymanagement;

import java.util.HashMap;

public class Library {
    private HashMap<String,Boolean> books = new HashMap<>();

    public Library(){

    }

    public void addBook(Book book){
        String bookId = book.getBookId();
        books.put(bookId,true);
    }

    public void removeBook(String bookId){
        books.remove(bookId);
    }

    public boolean bookExists(Book book, Member member){

        BookKeeper bookKeeper = new BookKeeper(books);
        String bookId = book.getBookId();
        boolean find = bookKeeper.searchBook(bookId);
        if(!find){
            return false;
        }

        bookKeeper.borrowBook(member,book);

        return true;
    }

}

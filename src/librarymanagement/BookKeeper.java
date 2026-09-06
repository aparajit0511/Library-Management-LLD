package librarymanagement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookKeeper {
    private final HashMap<String, Boolean> books;
    private HashMap<String,Member> bookList = new HashMap<>();
    private HashMap<String, List<Book>> borrowedBooks = new HashMap<String, List<Book>>();

    public BookKeeper(HashMap<String,Boolean> books){

        this.books = books;
    }

    public boolean searchBook(String bookId){
        if(this.books.containsKey(bookId) && this.books.containsValue(true)){
            return true;
        }
        return false;
    }

    public void borrowBook(Member member,Book book){
        String bookId = book.getBookId();
        for(Map.Entry<String,Boolean> bookavilability : books.entrySet())
        {
            String keyBook = bookavilability.getKey();
            if (bookId == keyBook){
                bookavilability.setValue(false);
            }
        }
    }
}

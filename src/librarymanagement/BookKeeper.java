package librarymanagement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookKeeper {
    private final HashMap<String, Boolean> books;
    private HashMap<Book,Member> bookList = new HashMap<>();
    private HashMap<Member, List<Book>> borrowedBooks = new HashMap<Member, List<Book>>();

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
        for(Map.Entry<String,Boolean> bookavailability : books.entrySet())
        {
            String keyBook = bookavailability.getKey();
            if (bookId == keyBook){
                bookavailability.setValue(false);
            }
        }
        bookList.put(book,member);
        List<Book> memberBooks = new ArrayList<>();
        memberBooks.add(book);
        borrowedBooks.put(member,memberBooks);
    }

    public void returnBook(Member member,Book book){
        String bookId = book.getBookId();
        for(Map.Entry<String,Boolean> bookavailability : books.entrySet())
        {
            String keyBook = bookavailability.getKey();
            if (bookId == keyBook){
                bookavailability.setValue(true);
            }
        }
        bookList.remove(book);
        for (List<Book> memberBooks : borrowedBooks.values()) {
            memberBooks.removeIf(books -> books.getBookId().equals(bookId));
        }
    }

    public String trackBookList(){
        for(Map.Entry<Book,Member> bookList : bookList.entrySet()){
            Book bookId = bookList.getKey();
            Member memberName = bookList.getValue();
            return "Book name " + bookId.getTitle() + " with author " + bookId.getAuthor() + " is with member "+ memberName.getMemberName();
        }
        return "";
    }

    public String trackMemberList(){
        for (Map.Entry<Member, List<Book>> entry : borrowedBooks.entrySet()){
            Member memberId = entry.getKey();
            List<Book> memberBooks = entry.getValue();

            StringBuilder result = new StringBuilder("member name " + memberId.getMemberName() + " holds books ");

            for (Book book : memberBooks) {
                result.append(book.getTitle()).append(" ");
            }

            return result.toString();
        }
        return "";
    }
}

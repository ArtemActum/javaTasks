package DesignTasks.Library;

/*
Спроектировать библиотеку, где:
В один момент времени активна одна книга
Можно переключаться между другими книгами
В книге всегда отображется последняя активная страница
*/

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Book> books;

    public Library() {
        this.books = new HashMap<>();
        this.activeBook = null;
    }

    private Book activeBook;

    public void addBook(Book book){
        books.put(book.getName(), book);
    }

    public void switchBook(String name){
        activeBook = books.get(name);
    }

    public void showActiveBook(){
        System.out.println("Current active book: " + activeBook.getName() + ", page: " + activeBook.getCurrentPage());
    }

    public void readActiveBook(){
        System.out.println("Read book: " + activeBook.getName() + ", page: " + activeBook.getCurrentPage());
        activeBook.readNextPage();
    }

    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("Book name"));
        library.addBook(new Book("Book name1"));
        library.addBook(new Book("Book name2"));

        library.switchBook("Book name");
        library.showActiveBook();
        library.readActiveBook();
        library.showActiveBook();
        library.switchBook("Book name1");
        library.showActiveBook();
        library.readActiveBook();
        library.showActiveBook();
    }
}

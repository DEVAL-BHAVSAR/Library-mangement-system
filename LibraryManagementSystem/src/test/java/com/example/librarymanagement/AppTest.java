package com.example.librarymanagement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("Effective Java", "Joshua Bloch");

        library.addBook(book);
        assertEquals(1, library.getTotalBooks(), "Book should be added to the library");
    }

    @Test
    public void testBorrowBook() {
        Library library = new Library();
        Book book = new Book("Effective Java", "Joshua Bloch");
        library.addBook(book);

        boolean isBorrowed = library.borrowBook("Effective Java");
        assertTrue(isBorrowed, "Book should be successfully borrowed");
    }

    @Test
    public void testReturnBook() {
        Library library = new Library();
        Book book = new Book("Effective Java", "Joshua Bloch");
        library.addBook(book);
        library.borrowBook("Effective Java");

        boolean isReturned = library.returnBook("Effective Java");
        assertTrue(isReturned, "Book should be successfully returned");
    }

    @Test
    public void testViewAvailableBooks() {
        Library library = new Library();
        Book book1 = new Book("Effective Java", "Joshua Bloch");
        Book book2 = new Book("Clean Code", "Robert C. Martin");
        library.addBook(book1);
        library.addBook(book2);

        String availableBooks = library.viewAvailableBooks();
        assertTrue(availableBooks.contains("Effective Java"), "Library should contain 'Effective Java'");
        assertTrue(availableBooks.contains("Clean Code"), "Library should contain 'Clean Code'");
}
}

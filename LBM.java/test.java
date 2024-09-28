public class test {
    package com.example.librarymanagement;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test {

    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testAddBook() {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook(book);

        // Check if the book has been added
        assertEquals(1, library.getBooks().size());
        assertEquals("The Great Gatsby", library.getBooks().get(0).getTitle());
        assertEquals("F. Scott Fitzgerald", library.getBooks().get(0).getAuthor());
    }
}
}

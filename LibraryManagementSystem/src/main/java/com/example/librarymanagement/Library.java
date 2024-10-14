package com.example.librarymanagement;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public boolean borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                books.remove(book);
                return true;
            }
        }
        return false;
    }

    public boolean returnBook(String title) {
        books.add(new Book(title, "Unknown Author")); // Simplified return logic
        return true;
    }

    public String viewAvailableBooks() {
        StringBuilder sb = new StringBuilder();
        for (Book book : books) {
            sb.append(book.getTitle()).append(" by ").append(book.getAuthor()).append("\n");
        }
        return sb.toString();
    }

    public int getTotalBooks() {
        return books.size();
}
}
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

class LibraryTest {
    private Library library;

    @BeforeEach
    void setUp() {
        library = new Library();
    }

    @Test
    void testAddBook() {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        library.addBook(book);

        List<Book> books = library.getBooks();
        assertEquals(1, books.size());
        assertEquals("The Great Gatsby", books.get(0).getTitle());
        assertEquals("F. Scott Fitzgerald", books.get(0).getAuthor());
    }
}
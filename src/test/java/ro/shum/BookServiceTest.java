package ro.shum;

import java.awt.print.Book;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

class BookServiceTest {

  @Test
  void testGetBookById() {
    // Arrange
    BookRepository bookRepository = Mockito.mock(BookRepository.class);
    BookService bookService = new BookService(bookRepository);
    Long bookId = 1L;
    Book expectedBook = new Book(bookId, "Test Book");

    // Act
    when(bookRepository.findById(bookId)).thenReturn(expectedBook);
    Book result = bookService.getBookById(bookId);

    // Assert
    assertEquals(expectedBook, result);
  }

  @Test
  void testGetAllBooks() {
    // Arrange
    BookRepository bookRepository = Mockito.mock(BookRepository.class);
    BookService bookService = new BookService(bookRepository);
    List<Book> expectedBooks = Arrays.asList(new Book(1L, "Book 1"), new Book(2L, "Book 2"));

    // Act
    when(bookRepository.findAll()).thenReturn(expectedBooks);
    List<Book> result = bookService.getAllBooks();

    // Assert
    assertEquals(expectedBooks, result);
  }

  // Similar tests for addBook and deleteBook methods
}

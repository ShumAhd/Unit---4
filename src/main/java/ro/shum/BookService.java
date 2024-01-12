package ro.shum;

import java.awt.print.Book;
import java.util.List;

public class BookService {
  private final BookRepository bookRepository;

  public BookService(BookRepository bookRepository) {
    this.bookRepository = bookRepository;
  }

  public Book getBookById(Long id) {
    return bookRepository.findById(id);
  }

  public List<Book> getAllBooks() {
    return bookRepository.findAll();
  }

  public void addBook(Book book) {
    bookRepository.save(book);
  }

  public void deleteBook(Long id) {
    bookRepository.delete(id);
  }
}

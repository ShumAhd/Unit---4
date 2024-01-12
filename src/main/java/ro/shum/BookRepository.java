package ro.shum;

import java.awt.print.Book;

public interface BookRepository {
  Book findById(Long id);
  List<Book> findAll();
  void save(Book book);
  void delete(Long id);
}


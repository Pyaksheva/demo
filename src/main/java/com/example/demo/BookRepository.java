package com.example.demo;

import java.util.List;

public interface BookRepository {
    List<Book> findAllBooks();
    Book findBooksById(String id);
}

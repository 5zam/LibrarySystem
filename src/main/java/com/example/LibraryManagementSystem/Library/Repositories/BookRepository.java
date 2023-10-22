package com.example.LibraryManagementSystem.Library.Repositories;

import com.example.LibraryManagementSystem.Library.Entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByTitle(String title);

    List<Book> findByCategory(String category);

    Book findByIsbn(String isbn);
}

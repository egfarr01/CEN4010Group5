package com.example.bookstoreProject.Book;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public interface BookService {
    List<Book> searchByTopTen();
    List<Book> searchBooksByGenre(String genre);
    List<Book> searchBooksByAuthor(Long authorId);
    List<Book> findVariableAmmount(int variable);
    Book searchBooksByISBN(String isbn);
    Book createBook(Book book);
}

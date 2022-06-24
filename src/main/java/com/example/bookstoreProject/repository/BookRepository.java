package com.example.bookstoreProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.bookstoreProject.entity.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Long>{
    
}
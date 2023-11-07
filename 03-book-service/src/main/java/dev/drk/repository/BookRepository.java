package dev.drk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.drk.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {}

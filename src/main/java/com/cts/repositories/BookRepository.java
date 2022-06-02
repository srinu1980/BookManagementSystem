package com.cts.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.model.Books;

public interface BookRepository extends JpaRepository<Books, Integer>{

}

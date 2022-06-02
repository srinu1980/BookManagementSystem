package com.cts.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.repositories.BookRepository;

@Service
public class BookService {

	@Autowired
	BookRepository bookRepository;
}

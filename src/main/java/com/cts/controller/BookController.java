package com.cts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.cts.services.BookService;

@RestController
public class BookController {

	@Autowired
	BookService service;
}

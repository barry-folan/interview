package com.aig.interview.service;

import com.aig.interview.repo.entity.Book;
import com.aig.interview.repo.entity.Film;
import org.springframework.stereotype.Service;

public interface EntertainmentService {

    public Film findByName(String name);

    public Book findByIsbn(String isbn);

    public Book findBasedOnBook(String filmName);
}

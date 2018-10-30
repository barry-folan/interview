package com.aig.interview.service;

import com.aig.interview.repo.BookRepo;
import com.aig.interview.repo.FilmRepo;
import com.aig.interview.repo.entity.Book;
import com.aig.interview.repo.entity.Film;
import org.springframework.beans.factory.annotation.Autowired;

public class EntertainmentServiceImpl implements EntertainmentService{

    private final FilmRepo filmRepo;
    private final BookRepo bookRepo;

    @Autowired
    public EntertainmentServiceImpl(FilmRepo filmRepo, BookRepo bookRepo) {
        this.filmRepo = filmRepo;
        this.bookRepo = bookRepo;
    }

    @Override
    public Film findByName(String name) {
        return filmRepo.findById(name).get();
    }

    @Override
    public Book findByIsbn(String isbn) {
        return bookRepo.findById(isbn).get();
    }

    @Override
    public Book findBasedOnBook(String filmName) {
        Film film = filmRepo.findById(filmName).get();
        Book book = bookRepo.findById(film.getBasedOnIsbn()).get();

        return book;
    }
}

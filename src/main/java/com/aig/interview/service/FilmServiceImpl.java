package com.aig.interview.service;

import com.aig.interview.repo.FilmRepo;
import com.aig.interview.repo.entity.Film;
import org.springframework.beans.factory.annotation.Autowired;

public class FilmServiceImpl implements FilmService {

  private final FilmRepo filmRepo;

  @Autowired
  public FilmServiceImpl(FilmRepo filmRepo) {
    this.filmRepo = filmRepo;
  }

  @Override
  public Film findByName(String name) {
    return filmRepo.findByName(name);
  }

}

package com.aig.interview.service;

import com.aig.interview.repo.entity.Film;

public interface FilmService {

  Film findByName(String name);
}

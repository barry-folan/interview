package com.aig.interview.repo;

import com.aig.interview.repo.entity.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepo {

  Film findByName(String name);
}

package com.aig.interview.service;

import com.aig.interview.repo.entity.Film;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

// complete this test class
@RunWith(MockitoJUnitRunner.class)
public class FilmServiceImplTest {

  String existingFilmName = "The Commitments";
  String nonExistingFilmName = "xyz";

  private FilmServiceImpl filmServiceImpl;

  @Test
  public void findByName_exists() {
    // complete this test using mocks
    Film actual = filmServiceImpl.findByName(existingFilmName);
  }

  @Test
  public void findByName_doesNotExist() {
    // complete this test using mocks
    Film actual = filmServiceImpl.findByName(nonExistingFilmName);
  }
}

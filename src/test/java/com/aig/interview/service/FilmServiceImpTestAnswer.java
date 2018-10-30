package com.aig.interview.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.doReturn;

import com.aig.interview.TestData.Films;
import com.aig.interview.repo.FilmRepo;
import com.aig.interview.repo.entity.Film;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FilmServiceImpTestAnswer {

  String existingFilmName = "The Commitments";
  String nonExistingFilmName = "xyz";

  @InjectMocks
  private FilmServiceImpl filmServiceImpl;
  @Mock
  private FilmRepo filmRepo;

  @Test
  public void findByName_exists() {
    doReturn(Films.THE_COMMITMENTS).when(filmRepo).findByName(existingFilmName);
    Film actual = filmServiceImpl.findByName(existingFilmName);
    assertThat(actual).isEqualTo(Films.THE_COMMITMENTS);
  }

  @Test
  public void findByName_doesNotExist() {
    doReturn(null).when(filmRepo).findByName(nonExistingFilmName);
    Film actual = filmServiceImpl.findByName(nonExistingFilmName);
    assertThat(actual).isNull();
  }
}

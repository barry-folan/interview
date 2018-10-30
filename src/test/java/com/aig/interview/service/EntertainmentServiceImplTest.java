package com.aig.interview.service;

import com.aig.interview.repo.BookRepo;
import com.aig.interview.repo.FilmRepo;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class EntertainmentServiceImplTest {

    String nameExists = "The Commitments";
    String nameNotExists = "U2";

    @InjectMocks
    private EntertainmentServiceImpl entertainmentServiceImpl;
    @Mock
    private FilmRepo filmRepo;
    @Mock
    private BookRepo bookRepo;

    @Test
    public void findByName_exists(){
    }

    @Test
    public void findByName_doesNotExist(){

    }

}

package com.rudov.todayinfoservice;

import com.rudov.todayinfoservice.entity.People;
import com.rudov.todayinfoservice.repositiry.PeopleRepository;
import com.rudov.todayinfoservice.service.PeopleServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class PeopleServiceTest {

    @Mock
    private PeopleRepository peopleRepository;

    private PeopleServiceImpl peopleService;

    @BeforeEach
    void setUp() {
        peopleService = new PeopleServiceImpl(peopleRepository);

        var people = new People();
        people.setName("Dima");
        people.setAge((byte) 28);
        Mockito.when(peopleRepository.findById(1L)).thenReturn(Optional.of(people));
    }

    @Test
    void setNewNamePeopleTest() {
        var people = peopleService.getPeople(1L);
        System.out.println(people);
    }
}

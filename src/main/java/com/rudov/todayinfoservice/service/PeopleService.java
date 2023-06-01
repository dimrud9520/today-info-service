package com.rudov.todayinfoservice.service;

import com.rudov.todayinfoservice.entity.People;

public interface PeopleService {

    People getPeople(Long id);

    void setPeopleName(Long id, String newName);

    void updatePeople(People people);
}

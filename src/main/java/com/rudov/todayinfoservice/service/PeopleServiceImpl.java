package com.rudov.todayinfoservice.service;

import com.rudov.todayinfoservice.entity.People;
import com.rudov.todayinfoservice.repositiry.PeopleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PeopleServiceImpl implements PeopleService {
    private final PeopleRepository peopleRepository;

    @Override
    public People getPeople(Long id) {
        return peopleRepository.findById(id).orElse(new People());
    }

    @Override
    public void setPeopleName(Long id, String newName) {
        var people = getPeople(id);
        people.setName(newName);
        updatePeople(people);
    }

    @Override
    public void updatePeople(People people) {
        peopleRepository.save(people);
    }
}

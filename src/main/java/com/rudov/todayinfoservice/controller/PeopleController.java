package com.rudov.todayinfoservice.controller;

import com.rudov.todayinfoservice.repositiry.PeopleRepository;
import com.rudov.todayinfoservice.entity.People;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/info-service")
public class PeopleController {

    private final PeopleRepository peopleRepository;


    @RequestMapping(value = "/people/add", method = RequestMethod.POST)
    public ResponseEntity<People> addPeople(@RequestBody People people) {
        var entity = new People();
        entity.setName(people.getName());
        return new ResponseEntity<>(peopleRepository.save(people), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/people/all", method = RequestMethod.GET)
    public ResponseEntity<List<People>> getAll() {
        var result = peopleRepository.findAll();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "/people/all/{id}", method = RequestMethod.GET)
    public ResponseEntity<People> getById(@PathVariable("id") Long id) {
        var result = peopleRepository.findById(id).orElseThrow();
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

}

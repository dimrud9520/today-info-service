package com.rudov.todayinfoservice.repositiry;

import com.rudov.todayinfoservice.entity.People;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PeopleRepository extends JpaRepository<People, Long> {
}

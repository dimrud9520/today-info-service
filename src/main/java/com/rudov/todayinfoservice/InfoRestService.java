package com.rudov.todayinfoservice;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class InfoRestService {

    public void getInfo() {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "http://localhost:8080/info/getAll";
        ResponseEntity<List> response
                = restTemplate.getForEntity(fooResourceUrl + "/1", List.class);
    }
}

package com.isppG8.friendsontour.friends_on_tour.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExampleService {

    @Autowired
    private ExampleRepository exampleRepository;

    public List<Example> getAllExamples() {
        return exampleRepository.findAll();
    }
}
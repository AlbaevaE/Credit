package com.example.credit.service;

import com.example.credit.model.Person;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PersonService {
    Person addPerson(Person p);
    Person getPersonById(Long id);
    List<Person>getAllPeople();
    void deletePerson(Long id);


}

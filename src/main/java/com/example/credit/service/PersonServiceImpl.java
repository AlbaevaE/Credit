package com.example.credit.service;

import com.example.credit.model.Person;
import com.example.credit.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person addPerson(Person p) {
        return this.personRepository.save(p);
    }

    @Override
    public Person getPersonById(Long id) {
        return this.personRepository.findById(id).get();
    }

    @Override
    public List<Person> getAllPeople() {
        return this.personRepository.findAll();
    }

    @Override
    public void deletePerson(Long id) {
        this.personRepository.deleteById(id);
    }
}

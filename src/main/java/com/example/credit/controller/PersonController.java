package com.example.credit.controller;

import com.example.credit.model.Person;
import com.example.credit.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person>getAllPeople(){
        return this.personService.getAllPeople();
    }

    @GetMapping("/{id}")
    public Person getPerson(@PathVariable Long id){
        return this.personService.getPersonById(id);
    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Person addPerson(@RequestBody Person p){
        return this.personService.addPerson(p);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id){
        this.personService.deletePerson(id);
    }
}

package com.example.credit.bootstrap;

import com.example.credit.enums.Enum;
import com.example.credit.model.Application;
import com.example.credit.model.Person;
import com.example.credit.service.ApplicatonService;
import com.example.credit.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Bootstrap implements CommandLineRunner {
    @Autowired
    private PersonService personService;
    @Autowired
    private ApplicatonService applicatonService;


    @Override
    public void run(String... args) throws Exception {
        Person p = new Person();
        p.setFio("K.G.V.");
        p.setAge(17);
        p.setPhoneNumber("9875674");
        p.setIncome(14980);
        personService.addPerson(p);
        Application ap = new Application();
        ap.setIntent("For Study");
        ap.setPerson(p);
        ap.setResponse(Enum.APPROVED);
        applicatonService.addApplication(ap);
    }
}

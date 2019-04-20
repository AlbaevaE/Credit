package com.example.credit.model;

import com.example.credit.enums.Enum;

import javax.persistence.*;

@Entity
@Table(name = "application")
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String intent;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
    private Enum response;
    private Integer confCode;

    public Application() {
    }

    public Application(Long id, String intent, Person person, Enum response, Integer confCode) {
        this.id = id;
        this.intent = intent;
        this.person = person;
        this.response = response;
        this.confCode = confCode;
    }

    public Integer getConfCode() {
        return confCode;
    }

    public void setConfCode(Integer confCode) {
        this.confCode = confCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntent() {
        return intent;
    }

    public void setIntent(String intent) {
        this.intent = intent;
    }

    public Person getPerson() {
        return person;
    }

    public Enum getResponse() {
        return response;
    }

    public void setResponse(Enum response) {
        this.response = response;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}

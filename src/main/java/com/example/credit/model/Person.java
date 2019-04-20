package com.example.credit.model;

import javax.persistence.*;

@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fio;
    private Integer age;
    private String phoneNumber;
    private Integer income;

    public Person() {
    }

    public Person(Long id, String fio, Integer age, String phoneNumber, Integer income) {
        this.id = id;
        this.fio = fio;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.income = income;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        if(this.income !=null) {
            if (this.income < 10000) {
                System.out.println("We cant give you credit");
            } else {
                this.income = income;
            }
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        if(this.age !=null) {
            if (this.age < 18) {
                System.out.println("We cant give");
            } else {
                this.age = age;
            }
        }
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

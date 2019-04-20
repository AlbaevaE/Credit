package com.example.credit.service;

import com.example.credit.model.Application;

import java.util.List;


public interface ApplicatonService {
    Application addApplication(Application a);

    Application getApplicationById(Long id);

    List<Application> getAllApplications();

    void deleteApplication(Long id);

    //List<javafx.application.Application> getAllPersonApplication(Long personId);
    boolean confApplication(Long id,Integer confCode);

}

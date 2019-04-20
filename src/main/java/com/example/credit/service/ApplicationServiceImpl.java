package com.example.credit.service;


import com.example.credit.enums.Enum;
import com.example.credit.model.Application;
import com.example.credit.repository.ApplicationRepository;
import com.example.credit.repository.PersonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class ApplicationServiceImpl implements ApplicatonService {
    @Autowired
    private ApplicationRepository applicationRepository;
    @Autowired
    private PersonRepository personRepository;


    @Override
    public com.example.credit.model.Application addApplication(com.example.credit.model.Application a) {
        return this.applicationRepository.save(a);
    }

    @Override
    public com.example.credit.model.Application getApplicationById(Long id) {
        return this.applicationRepository.findById(id).get();
    }

    @Override
    public List<com.example.credit.model.Application> getAllApplications() {
        return this.applicationRepository.findAll();
    }

    @Override
    public void deleteApplication(Long id) {
        this.applicationRepository.deleteById(id);
    }

    @Override
    public boolean confApplication(Long id, Integer confCode) {
        Application ap = getApplicationById(id);
        if (ap == null) return false;
        if (ap.getConfCode().equals(confCode)) {
            ap.setResponse(Enum.APPROVED);
            this.applicationRepository.save(ap);
            return true;
        }
        return false;
    }

//    @Override
//    public List<Application> getAllPersonApplication(Long personId) {
//        List<Application> applications = (List) applicationRepository.findAll()
//                .stream().filter(x -> x.getPerson().getId().equals(personId)).collect(Collectors.toList());//выяснить почему ошибка

//        List<Application>applications = applicationRepository.findAll();
//        List<Application>ap = new ArrayList<>();
//        for (Application application: applications) {
//            if (application)
//        }

//        return applications;
//    }
}

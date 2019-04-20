package com.example.credit.controller;

import com.example.credit.model.Application;
import com.example.credit.model.Response;
import com.example.credit.service.ApplicatonService;
import com.example.credit.util.ConfermationCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/application")
public class ApplicationController {
    @Autowired
    private ApplicatonService applicatonService;

    @GetMapping("/{id}")
    public Application getOneApplication(@PathVariable Long id) {
        return this.applicatonService.getApplicationById(id);
    }

    @GetMapping
    public List<Application> getAllApplication() {
        return this.applicatonService.getAllApplications();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Application addApplication(@RequestBody Application ap) {
        return this.applicatonService.addApplication(ap);
    }

    @DeleteMapping("/{id}")
    public void deleteApplication(@PathVariable Long id) {
        this.applicatonService.deleteApplication(id);
    }

    @PostMapping("/confirm")
    @ResponseStatus(HttpStatus.CREATED)
    private Response confirmPayment(@RequestBody ConfermationCode confermation) {
        try {
            return new Response(applicatonService.confApplication(confermation.getId(), confermation.getConfCode()),
                    "Successfully confirmed", this.getOneApplication(confermation.getId()));

        } catch (Exception ex) {
            return new Response(false, ex.toString(), null);
        }
    }
}

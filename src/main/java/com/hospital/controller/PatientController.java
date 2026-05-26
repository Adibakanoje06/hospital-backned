package com.hospital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.model.Patient;
import com.hospital.service.PatientService;

@RestController
@CrossOrigin("*")
public class PatientController {

    @Autowired
    private PatientService service;

    @GetMapping("/patients")
    public List<Patient> getPatients() {

        return service.getAllPatients();

    }

    @PostMapping("/patients")
    public Patient addPatient(
            @RequestBody Patient patient){

        return service.savePatient(patient);

    }

}
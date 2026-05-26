package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.model.Patient;
import com.hospital.repository.PatientRepository;

@Service
public class PatientService {

    @Autowired
    PatientRepository repo;

    public List<Patient> getAllPatients(){

        return repo.findAll();

    }

    public Patient savePatient(
            Patient patient){

        return repo.save(patient);

    }

}
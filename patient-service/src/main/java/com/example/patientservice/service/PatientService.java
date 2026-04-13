package com.example.patientservice.service;

import com.example.patientservice.dto.PatientResponseDTO;
import com.example.patientservice.mapper.PatientMapper;
import com.example.patientservice.model.Patient;
import com.example.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients() {
        List<Patient> patients = patientRepository.findAll();

        //Create a new response of patientDTOs
        // Loop through each patient in the list

        return patients.stream().map(PatientMapper::toDTO).toList();
    }
}

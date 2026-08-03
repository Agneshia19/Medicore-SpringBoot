package com.medicore.service;
import com.medicore.entity.Patient;
import com.medicore.exception.ResourceNotFoundException;
import com.medicore.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public List<Patient> getAllPatients() {
        return patientRepository.findAll();
    }
    public Patient updatePatient(Patient patient) {
    return patientRepository.save(patient);
}
public void deletePatient(int patientId) {
    patientRepository.deleteById(patientId);
}
public Patient getPatientById(int id) {
    return patientRepository.findById(id)
            .orElseThrow(() -> 
                    new ResourceNotFoundException("Patient not found with id: " + id));
}
}
package com.medicore.controller;
import org.springframework.web.bind.annotation.PathVariable;
import jakarta.validation.Valid;
import com.medicore.entity.Patient;
import com.medicore.service.PatientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.getAllPatients();
    }

    @PostMapping
    public Patient addPatient(@Valid @RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }
    @PutMapping
public Patient updatePatient(@RequestBody Patient patient) {
    return patientService.updatePatient(patient);
}
@DeleteMapping("/{id}")
public void deletePatient(@PathVariable int id) {
    patientService.deletePatient(id);
}
@GetMapping("/{id}")
public Patient getPatientById(@PathVariable int id) {
    return patientService.getPatientById(id);
}
}
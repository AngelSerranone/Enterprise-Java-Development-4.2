package com.ironhack.lab4_2.controller.impl;
import com.ironhack.lab4_2.controller.interfaces.IPatientController;
import com.ironhack.lab4_2.enums.Status;
import com.ironhack.lab4_2.model.Patient;
import com.ironhack.lab4_2.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.util.List;

@RestController
public class PatientController implements IPatientController {

    @Autowired
    private PatientRepository patientRepository;

    // Create a route to get all patients
    @GetMapping("/all-patients")
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    // Create a route to get patients by name
    @GetMapping("/patients/{name}")
    public List<Patient> findByName(@PathVariable(name="name") String name) {
        return patientRepository.findByName(name);
    }

    // Create a route to get a patient by patient_id
    @GetMapping("patient-by-id/{id}")
    public Patient findByPatientId(@PathVariable(name="id")Integer id) {
        return patientRepository.findByPatientId(id);
    }

    // Create a route to get patients by doctor
    @GetMapping("patient-by-doctor/{name}")
    public List<Patient> findByDoctorName(@PathVariable(name="name") String name) {
        return patientRepository.findByDoctorName(name);
    }

    // Create a route to get patients date of birth within a specified range
    @GetMapping("patient-by-range/{dateStart}/{dateEnd}")
    public List<Patient> findByDateOfBirthBetween(@PathVariable(name="dateStart") String startDate, @PathVariable(name="dateEnd") String dateEnd) {
        return patientRepository.findByDateOfBirthBetween(LocalDate.parse(startDate), LocalDate.parse(dateEnd));
    }

    // Create a route to get patients by department that their admitting doctor is in
    @GetMapping("patients-by-department/{department}")
    public List<Patient> findByDoctorDepartment(@PathVariable(name="department")String department) {
        return patientRepository.findByDoctorDepartment(department);
    }

    // Create a route to get all patients with a doctor whose status is OFF
    @GetMapping("patients-by-doctor-status/{status}")
    public List<Patient> findByDoctorStatusOff(@PathVariable(name="status") Status status) {
        return patientRepository.findByDoctorStatusOff(status);
    }
}

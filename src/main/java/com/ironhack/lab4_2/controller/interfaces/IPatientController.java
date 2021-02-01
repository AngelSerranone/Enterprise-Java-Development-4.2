package com.ironhack.lab4_2.controller.interfaces;
import com.ironhack.lab4_2.controller.impl.PatientController;
import com.ironhack.lab4_2.enums.Status;
import com.ironhack.lab4_2.model.Patient;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface IPatientController {

    public List<Patient> findByName(String name);
    public Patient findByPatientId(Integer id);
    public List<Patient> findByDoctorName(String admittedBy);
    public List<Patient> findByDateOfBirthBetween(String startDate, String dateEnd);
    public List<Patient> findByDoctorDepartment(String department);
    public List<Patient> findByDoctorStatusOff(Status status);
}

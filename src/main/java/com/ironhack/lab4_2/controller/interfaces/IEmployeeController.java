package com.ironhack.lab4_2.controller.interfaces;
import com.ironhack.lab4_2.enums.Status;
import com.ironhack.lab4_2.model.Employee;
import com.ironhack.lab4_2.model.Patient;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


public interface IEmployeeController {

    public Employee findByEmployeeId(Integer employeeId);
    public List<Employee> findByStatus(Status status);
    public List<Employee> findByDepartment(String department);
}

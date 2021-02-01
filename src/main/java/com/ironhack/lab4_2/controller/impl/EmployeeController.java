package com.ironhack.lab4_2.controller.impl;
import com.ironhack.lab4_2.controller.interfaces.IEmployeeController;
import com.ironhack.lab4_2.enums.Status;
import com.ironhack.lab4_2.model.Employee;
import com.ironhack.lab4_2.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class EmployeeController implements IEmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    // Create a route to get all doctors
    @GetMapping("/all-doctors")
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    // Create a route to get doctor by employee_id
    @GetMapping("/doctor-by-id/{id}")
    public Employee findByEmployeeId(@PathVariable(name="id")Integer id) {
        return employeeRepository.findByEmployeeId(id);
    }

    // Create a route to get doctors by status
    @GetMapping("/doctors-by-status/{status}")
    public List<Employee> findByStatus(@PathVariable(name="status") Status status) {
        return employeeRepository.findByStatus(status);
    }

    // Create a route to get doctors by department
    @GetMapping("/doctors-by-department/{department}")
    public List<Employee> findByDepartment(@PathVariable(name="department") String department) {
        return employeeRepository.findByDepartment(department);
    }
}

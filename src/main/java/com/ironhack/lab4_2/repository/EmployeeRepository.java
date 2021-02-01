package com.ironhack.lab4_2.repository;
import com.ironhack.lab4_2.enums.Status;
import com.ironhack.lab4_2.model.Employee;
import com.ironhack.lab4_2.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public Employee findByEmployeeId(Integer employeeId);
    public List<Employee> findByStatus(Status status);
    public List<Employee> findByDepartment(String department);
}

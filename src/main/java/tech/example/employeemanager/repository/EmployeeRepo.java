package tech.example.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.example.employeemanager.model.Employee;

import java.util.Optional;

//Long is the type of PrimaryKey
public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}

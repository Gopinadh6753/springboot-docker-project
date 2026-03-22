package Sample.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Sample.project.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // You can define custom query methods here if needed
}

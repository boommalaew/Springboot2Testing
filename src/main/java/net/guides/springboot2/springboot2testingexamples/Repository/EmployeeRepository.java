package net.guides.springboot2.springboot2testingexamples.Repository;

import net.guides.springboot2.springboot2testingexamples.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    Employee findByFirstName(String username);

}

package net.guides.springboot2.springboot2testingexamples;

import net.guides.springboot2.springboot2testingexamples.Repository.EmployeeRepository;
import net.guides.springboot2.springboot2testingexamples.model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@DataJpaTest
public class EmployeeRepositoryTests {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private TestEntityManager entityManager;

    // example 1
/*    @Test
    public void testSaveEmployee() {
        Employee employee = new Employee("admin", "admin", "admin@gmail.com");
        employeeRepository.save(employee);
        Employee employee2 = employeeRepository.findByFirstName("admin");
        assertNotNull(employee);
        assertEquals(employee2.getFirstName(), employee.getFirstName());
        assertEquals(employee2.getLastName(), employee.getLastName());
    }   */

    // example 2, Include entityManager.
    @Test
    public void testSaveEmployee() {
        Employee employee = new Employee("admin", "admin", "admin@gmail.com");
        Long id = entityManager.persistAndGetId(employee, Long.class);
        System.out.println("id = "+id);
        System.out.println("employee = "+employee);
        assertNotNull(id);
        Employee employee2 = employeeRepository.findByFirstName("admin");
        assertNotNull(employee);
        assertEquals(employee2.getFirstName(), employee.getFirstName());
        assertEquals(employee2.getLastName(), employee.getLastName());
    }

    @Test
    public void testGetEmployee() {
        Employee employee = new Employee("admin", "admin", "admin@gmail.com");
        employeeRepository.save(employee);
        Employee employee2 = employeeRepository.findByFirstName("admin");
        assertNotNull(employee);
        assertEquals(employee2.getFirstName(), employee.getFirstName());
        assertEquals(employee2.getLastName(), employee.getLastName());
    }

    @Test
    public void findAllEmployee() {
        Employee employee = new Employee("admin", "admin", "admin@gmail.com");
        employeeRepository.save(employee);
        assertNotNull(employeeRepository.findAll());
    }

    @Test
    public void deleteByEmployeeIdTest() {
        Employee employee = new Employee("admin", "admin", "admin@gmail.com");
        Employee emp = employeeRepository.save(employee);
        employeeRepository.deleteById(emp.getId());
    }

}

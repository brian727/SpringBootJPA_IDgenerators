package com.brian.springdata.idgenerators.repos;
import org.springframework.data.repository.CrudRepository;
import com.brian.springdata.idgenerators.entities.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}

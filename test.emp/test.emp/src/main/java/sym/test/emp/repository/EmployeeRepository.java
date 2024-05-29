package sym.test.emp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sym.test.emp.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{

}

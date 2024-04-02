package com.fullstack.angular.angularspring.repositoty;

import com.fullstack.angular.angularspring.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {


}

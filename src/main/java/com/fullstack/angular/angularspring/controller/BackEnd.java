package com.fullstack.angular.angularspring.controller;

import com.fullstack.angular.angularspring.entity.Employee;
import com.fullstack.angular.angularspring.repositoty.EmployeeRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class BackEnd {

    @Autowired
    private EmployeeRepo employeeRepo;

    @GetMapping("/all")
    List<Employee> getAll(){
        return employeeRepo.findAll();
    }

    @PostMapping("/add")
    Employee add(@RequestBody  Employee employee){

        return employeeRepo.save(employee);
    }

    @PutMapping("{id}")
    Employee update(@PathVariable("id") int id, @RequestBody Employee employee){
        Employee employee1 = employeeRepo.findById(id).get();
        employee1.setEmail(employee.getEmail());
        employee1.setId(employee.getId());
        employee1.setPassword(employee.getPassword());

        return employeeRepo.save(employee1);
    }
    @GetMapping("{id}")
    Employee getEmp(@PathVariable("id") int id){

        return employeeRepo.findById(id).get();
    }
    @DeleteMapping("{id}")
    String delete(@PathVariable("id") int id){


         employeeRepo.deleteById(id);
         return "Deleted successfully";
    }




}


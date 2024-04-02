import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { EmployeeService } from 'src/app/employee.service';
import { Employee } from 'src/app/model/employee';

@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent {
  employee: Employee = new Employee();
  submitted=false;

  constructor(private  empService : EmployeeService, private route:Router) {}
  onSubmit(){
    this.empService.addEmployee(this.employee).subscribe(data=>{
      console.log(data);
      this.submitted=true;
      this.employee= new Employee();
      this.route.navigate(['/home'])
    },err=> console.log(err));
  }
}

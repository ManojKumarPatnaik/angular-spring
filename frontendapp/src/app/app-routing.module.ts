import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EmployeeListComponent } from './component/employee-list/employee-list.component';
import { CreateEmployeeComponent } from './component/create-employee/create-employee.component';
import { UpdateEmployeeComponent } from './component/update-employee/update-employee.component';
import { DeleteEmployeeComponent } from './component/delete-employee/delete-employee.component';
import { GetEmployeeComponent } from './component/get-employee/get-employee.component';

const routes: Routes = [
  {
    path: 'home',
    component: EmployeeListComponent,
  },
  {
    path: 'add',
    component: CreateEmployeeComponent,
  },
 
  {
    path: 'delete',
    component: DeleteEmployeeComponent,
  },
 
  { path: 'update/:id', component: UpdateEmployeeComponent },
  { path: 'details/:id', component: GetEmployeeComponent },
  {
    path: '',
    redirectTo: 'home',
    pathMatch: 'full',
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {}

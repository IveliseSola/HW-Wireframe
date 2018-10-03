import { NgModule }             from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TaskComponent } from './task/tasks.component';
import { DashboardComponent }   from './dashboard/dashboard.component';
import { TaskDetailComponent } from './task-detail/task-detail.component';

const routes: Routes = [
  { path: '', redirectTo: '/dashboard', pathMatch: 'full' },
  { path: 'tasks', component: TaskComponent },
  { path: 'dashboard', component: DashboardComponent }, 
  { path: 'detail/:id', component: TaskDetailComponent },
];


@NgModule({
  exports: [ RouterModule ],
  imports: [ RouterModule.forRoot(routes) ]
})


export class AppRoutingModule { }


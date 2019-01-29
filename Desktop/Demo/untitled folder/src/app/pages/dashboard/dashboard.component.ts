import { Component, OnInit } from '@angular/core';
import { ProjectService } from 'src/app/services/project.service';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent implements OnInit {
  selectedProject;
  showModal = false;
  deleteModalOpen = false;
  isEditable = false;
  projects = [];
  editform = new FormGroup({
    name: new FormControl(''),
    description: new FormControl(''),
    deadline: new FormControl('')
  });
  addForm = new FormGroup({
    name: new FormControl(''),
    description: new FormControl(''),
    deadline: new FormControl('')
  });

  constructor(private service: ProjectService) { }

  ngOnInit() {
    this.service.getAllProjects()
      .subscribe(data => {
        console.log(data);
        this.projects = data;
      });
  }

  openModal(item) {
    console.log(item);
    this.isEditable = item.editable;
    this.selectedProject = item.item;
    this.showModal = true;
  }

  addNewProject(project) {
    this.service.createNewProject(project)
      .subscribe(data => {
        console.log(data);
        this.projects.push(data);
        this.addForm.reset()  ;
      });
  }

  updateProject(project) {
    console.log(project);
    this.service.updateProject(this.selectedProject.id, project)
      .subscribe(data => {
        this.showModal = false;
        console.log(data.id);
        const index = this.projects.findIndex(proj => proj.id === data.id);
        console.log(index);
        this.projects[index] = {
          name: data.name,
          description: data.description,
          deadline: data.deadline,
          id: data.id
        };
      });
  }

  openDeleteModal(project) {
    this.selectedProject = project;
    this.deleteModalOpen = true;
  }

  deleteProject(project) {
    console.log(project.id);
    const index = this.projects.findIndex(proj => proj.id === project.id);
    console.log(index);
    this.service.deleteProject(project.id)
      .subscribe(data => {
        this.projects.splice(index, 1);
      });
    this.deleteModalOpen = false;
  }

}

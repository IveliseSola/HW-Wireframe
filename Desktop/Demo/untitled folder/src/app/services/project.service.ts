import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class ProjectService {
  baseUrl = 'http://localhost:8080/projects/';

  constructor(
    private http: HttpClient
  ) { }

  getAllProjects(): Observable<any> {
    return this.http.get(`${this.baseUrl}`);
  }
  getProjectById(id) {
    return this.http.get(`${this.baseUrl}${id}`);
  }
  createNewProject(project) {
    return this.http.post(`${this.baseUrl}project`, project);
  }
  updateProject(id, newProject): Observable<any> {
    return this.http.put(`${this.baseUrl}${id}`, newProject);
  }
  deleteProject(id) {
    return this.http.delete(`${this.baseUrl}${id}`);
  }
}

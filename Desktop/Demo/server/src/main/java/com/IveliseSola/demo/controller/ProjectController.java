package com.IveliseSola.demo.controller;

import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.IveliseSola.demo.model.Project;
import com.IveliseSola.demo.repository.ProjectRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/projects")
@RestController
public class ProjectController {

    @Autowired
    ProjectRepository projectRepository;

    // Project project;

    @GetMapping("/")
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

    @GetMapping("/{Id}")
    public Project getProject(@PathVariable long Id) {
    	Optional<Project> project = projectRepository.findById(Id);
    	if (!project.isPresent())
    		throw new RuntimeException("ProjectId " + Id + " not found");
    	return project.get();
    }

    @PostMapping("/project")
    public Project createProject(@Valid @RequestBody Project project) {
        return projectRepository.save(project);
    }
 
    @PutMapping("/{Id}")
    public Project updateProject(@PathVariable String Id,
                                 @Valid @RequestBody Project projectRequest) {
    	Long auxId = Long.parseLong(Id);
        return projectRepository.findById(auxId).map(project -> {
            project.setName(projectRequest.getName());
            project.setDescription(projectRequest.getDescription());
            project.setDeadline(projectRequest.getDeadline());
            return projectRepository.save(project);
        }).orElseThrow(() -> new RuntimeException("ProjectId " + Id + " not found"));
    }

    @DeleteMapping("/{Id}")
    public ResponseEntity<?> deleteProject(@PathVariable long Id) {
//    	Long auxId = Long.parseLong(Id);
        return projectRepository.findById(Id).map(project -> {
            projectRepository.delete(project);
            return ResponseEntity.ok().build();
        }).orElseThrow(() -> new RuntimeException("ProjectId " + Id + " not found"));
    }
}

package com.yoprogramo.portfolio.Controller;

import com.yoprogramo.portfolio.Entity.Project;
import com.yoprogramo.portfolio.Service.ImplProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
    
    @Autowired
    private final ImplProjectService projectService;

    public ProjectController(ImplProjectService projectService) {
        this.projectService = projectService;
    }
    
    @GetMapping()
    public ResponseEntity<List<Project>> getProjects(){
        List<Project> projects = projectService.getProjects();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Project> getProjectById(@PathVariable("id") Long idProject){
        Project project = projectService.findProjectById(idProject);
        return new ResponseEntity<>(project, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<Project> createProject(@RequestBody Project project){
        Project newProject = projectService.saveProject(project);
        return new ResponseEntity<>(newProject, HttpStatus.CREATED);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Project> updateProject(@RequestBody Project project){
        Project projectUpdate = projectService.saveProject(project);
        return new ResponseEntity<>(projectUpdate, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteProject(@PathVariable("id") Long idProject){
        projectService.deleteProject(idProject);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

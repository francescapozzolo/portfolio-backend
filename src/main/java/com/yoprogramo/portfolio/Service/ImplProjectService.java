package com.yoprogramo.portfolio.Service;

import com.yoprogramo.portfolio.Entity.Project;
import com.yoprogramo.portfolio.Interface.IProjectService;
import com.yoprogramo.portfolio.Repository.IProjectRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ImplProjectService implements IProjectService{
    
    @Autowired IProjectRepository iProjectRepository;
    
    @Override
    public List<Project> getProjects() {
        List<Project> projects = iProjectRepository.findAll();
        return projects;
    }

    @Override
    public Project saveProject(Project project) {
        Project newProject = iProjectRepository.save(project);
        return newProject;
    }

    @Override
    public void deleteProject(Long idProject) {
        iProjectRepository.deleteById(idProject);
    }

    @Override
    public Project findProjectById(Long idProject) {
        Project project = iProjectRepository.findById(idProject).orElse(null);
        return project;
    }
}

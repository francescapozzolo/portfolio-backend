package com.yoprogramo.portfolio.Interface;

import com.yoprogramo.portfolio.Entity.Project;
import java.util.List;

public interface IProjectService {
    
    public List<Project> getProjects();
    
    public Project saveProject(Project project);
    
    public void deleteProject(Long idProject);
    
    public Project findProjectById(Long idProject);
}

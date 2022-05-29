package com.yoprogramo.portfolio.Entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@Getter @Setter
@Entity
@Table(name = "project")
public class Project implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_project", nullable = false)
    private Long idProject;
    
    @Column(name = "title_project", length = 200, nullable = false)
    private String titleProject; 
    
    @Column(name = "description_project", length = 1000, nullable = false)
    private String descriptionProject; 
    
    @Column(name = "pic_project", length = 500, nullable = false)
    private String picProject; 
    
    @Column(name = "link_github", length = 500, nullable = false)
    private String linkGithub;
    
    @Column(name = "url_project", length = 500, nullable = false)
    private String urlProject;

    public Project() {
    }

    public Project(Long idProject, String titleProject, String descriptionProject, String picProject, String linkGithub, String urlProject) {
        this.idProject = idProject;
        this.titleProject = titleProject;
        this.descriptionProject = descriptionProject;
        this.picProject = picProject;
        this.linkGithub = linkGithub;
        this.urlProject = urlProject;
    }
       
}

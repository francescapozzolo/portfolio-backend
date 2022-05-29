package com.yoprogramo.portfolio.Entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.*;

@Getter @Setter
@Table(name = "person")
@Entity
public class Person implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_person", nullable = false, updatable = false)
    private Long idPerson;
    
    @Column (name = "name", length = 50, nullable = false)
    private String name; 
    
    @Column(name = "surname", length = 50, nullable = false)
    private String surname; 
    
    @Column(name = "email", length = 50, nullable = false)
    private String email;
    
    @Column(name = "github_url", length = 100, nullable = false)
    private String githubUrl;
    
    @Column(name = "linkedin_url", length = 100, nullable = false)
    private String linkedinUrl;
    
    @Column(name = "phone", length = 50, nullable = false)
    private String phone;
    
    @Column(name = "pic_profile", length = 1000, nullable = false)
    private String picProfile;
    
    @Column(name = "description", length = 5000, nullable = false)
    private String description;
    
    @Column(name = "profession", length = 100, nullable = false)
    private String profession;
    
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idEducation")
    private List<Education> educationList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idExperience")
    private List<Experience> experienceList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idSkill")
    private List<Skill> skillsList;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "idProject")
    private List<Project> projectList;

    public Person() {
    }

    public Person(String name, String surname, String email, String githubUrl, String linkedinUrl, String phone, String picProfile, String profession, List<Education> educationList, List<Experience> experienceList, List<Skill> skillsList, List<Project> projectList) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.githubUrl = githubUrl;
        this.linkedinUrl = linkedinUrl;
        this.phone = phone;
        this.picProfile = picProfile;
        this.profession = profession;
        this.educationList = educationList;
        this.experienceList = experienceList;
        this.skillsList = skillsList;
        this.projectList = projectList;
    }
    
}

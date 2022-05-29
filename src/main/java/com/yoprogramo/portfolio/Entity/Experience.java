package com.yoprogramo.portfolio.Entity;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.*;
import lombok.*;

@Getter @Setter
@Entity
@Table(name = "experience")
public class Experience implements Serializable{
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_experience", nullable = false)
    private Long idExperience;
    
    @Column(name = "experience_title", length = 500, nullable = false)
    private String experienceTitle;
    
    @Column(name = "start_experience", columnDefinition = "DATE", nullable = false)
    private LocalDate startExperience;
    
    @Column(name = "end_experience", columnDefinition = "DATE", nullable = false)
    private LocalDate end_experience;
    
    @Column(name = "experience_description", length = 1000, nullable = false)
    private String experience_description;
    
    @Column(name = "company_name", length = 100, nullable = false)
    private String company_name;

    public Experience() {
    }

    public Experience(Long idExperience, String experienceTitle, LocalDate startExperience, LocalDate end_experience, String experience_description, String company_name) {
        this.idExperience = idExperience;
        this.experienceTitle = experienceTitle;
        this.startExperience = startExperience;
        this.end_experience = end_experience;
        this.experience_description = experience_description;
        this.company_name = company_name;
    }
    
}

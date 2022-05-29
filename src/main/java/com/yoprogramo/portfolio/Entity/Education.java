package com.yoprogramo.portfolio.Entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@Getter @Setter
@Entity
@Table(name = "education")
public class Education implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_education", nullable = false)
    private Long idEducation;
    
    @Column(name = "title_education", length = 200, nullable = false)
    private String titleEducation; 
    
    @Column(name = "is_finished", nullable = false)
    private boolean isFinished; 
    
    @Column(name = "pic_education", length = 500, nullable = false)
    private String picEducation; 
    
    @Column(name = "institution", length = 500, nullable = false)
    private String institution;

    public Education() {
    }

    public Education(Long idEducation, String titleEducation, boolean isFinished, String picEducation, String institution) {
        this.idEducation = idEducation;
        this.titleEducation = titleEducation;
        this.isFinished = isFinished;
        this.picEducation = picEducation;
        this.institution = institution;
    }
    
}

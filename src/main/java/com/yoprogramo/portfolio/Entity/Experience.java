package com.yoprogramo.portfolio.Entity;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.*;

@Getter @Setter
@Entity
public class Experience {
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    private String jobTitle;
    
    private Date startDate;
    
    private Date endDate;
    
    private String description;
    
    private String seniority;
    
}

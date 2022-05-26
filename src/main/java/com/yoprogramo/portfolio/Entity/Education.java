package com.yoprogramo.portfolio.Entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.*;

@Getter @Setter
@Entity
public class Education {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    private String title; 
    
    private boolean isFinished; 
    
    private String grade;
}

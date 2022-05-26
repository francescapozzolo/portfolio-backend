package com.yoprogramo.portfolio.Entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.*;

@Getter @Setter
@Entity
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    private String name;
    
    private char type;
    
    private int percentage;
}

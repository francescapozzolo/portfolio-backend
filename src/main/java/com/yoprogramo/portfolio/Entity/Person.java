package com.yoprogramo.portfolio.Entity;

import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.*;

@Getter @Setter
@Entity
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    @Size(min = 2, max = 50)
    private String name; 
    
    @NotNull
    @Size(min = 2, max = 50)
    private String last_name; 
    
    @NotNull 
    private String email;
    
    private String img_url;
    
    private String description;
    
    private String profession;
}

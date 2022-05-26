package com.yoprogramo.portfolio.Entity;

import java.util.Date;
import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.*;

@Getter @Setter
@Entity
public class Institution{
   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @NotNull
    private String name;
    
    private String imgUrl;
    
}

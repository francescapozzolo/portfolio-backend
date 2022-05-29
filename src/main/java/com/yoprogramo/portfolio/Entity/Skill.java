package com.yoprogramo.portfolio.Entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@Getter @Setter
@Entity
@Table(name = "skill")
public class Skill implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_skill", nullable = false)
    private Long idSkill;
    
    @Column(name = "skill_name", nullable = false)
    private String skillName;
    
    @Column(name = "type_skill", nullable = false)
    private char typeSkill;
    
    @Column(name = "pic_skill")
    private String picSkill;
    
    @Column(name = "pencentage_skill")
    private int percentageSkill;

    public Skill() {
    }

    public Skill(Long idSkill, String skillName, char typeSkill, String picSkill, int percentageSkill) {
        this.idSkill = idSkill;
        this.skillName = skillName;
        this.typeSkill = typeSkill;
        this.picSkill = picSkill;
        this.percentageSkill = percentageSkill;
    }
}

package com.yoprogramo.portfolio.Repository;

import com.yoprogramo.portfolio.Entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISkillRepository extends JpaRepository<Skill, Long>{
    
}


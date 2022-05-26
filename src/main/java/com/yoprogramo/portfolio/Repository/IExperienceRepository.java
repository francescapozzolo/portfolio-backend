package com.yoprogramo.portfolio.Repository;

import com.yoprogramo.portfolio.Entity.Experience;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IExperienceRepository extends JpaRepository<Experience, Long>{
    
}

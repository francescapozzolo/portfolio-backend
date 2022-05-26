package com.yoprogramo.portfolio.Repository;

import com.yoprogramo.portfolio.Entity.Education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEducationRepository extends JpaRepository<Education, Long>{
    
}

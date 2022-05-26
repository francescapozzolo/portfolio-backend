package com.yoprogramo.portfolio.Repository;

import com.yoprogramo.portfolio.Entity.Institution;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IInstitutionRepository extends JpaRepository<Institution, Long>{
    
}

package com.yoprogramo.portfolio.Repository;

import com.yoprogramo.portfolio.Entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICompanyRepository extends JpaRepository<Company, Long>{
    
}

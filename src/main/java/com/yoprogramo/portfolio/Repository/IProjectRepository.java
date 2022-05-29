package com.yoprogramo.portfolio.Repository;

import com.yoprogramo.portfolio.Entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProjectRepository extends JpaRepository<Project, Long>{
    
}

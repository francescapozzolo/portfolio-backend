package com.yoprogramo.portfolio.Repository;

import com.yoprogramo.portfolio.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPersonRepository extends JpaRepository<Person, Long>{
    
}

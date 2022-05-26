package com.yoprogramo.portfolio.Interface;

import com.yoprogramo.portfolio.Entity.Person;
import java.util.List;

public interface IPersonService {
    
    public List<Person> getPersons();
    
    public void savePerson(Person person);
    
    public void deletePerson(Long id);
    
    public Person findPerson(Long id);
}

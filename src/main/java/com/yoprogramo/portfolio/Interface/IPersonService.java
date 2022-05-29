package com.yoprogramo.portfolio.Interface;

import com.yoprogramo.portfolio.Entity.Person;
import java.util.List;

public interface IPersonService {
    
    public List<Person> getPersons();
    
    public Person savePerson(Person person);
    
    public void deletePerson(Long idPerson);
    
    public Person findPersonById(Long idPerson);
}

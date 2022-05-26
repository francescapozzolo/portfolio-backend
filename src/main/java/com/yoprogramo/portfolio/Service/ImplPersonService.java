package com.yoprogramo.portfolio.Service;

import com.yoprogramo.portfolio.Entity.Person;
import com.yoprogramo.portfolio.Interface.IPersonService;
import com.yoprogramo.portfolio.Repository.IPersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplPersonService implements IPersonService{
   
    @Autowired IPersonRepository iPersonRepository;
    
    @Override
    public List<Person> getPersons() {
        List<Person> persons = iPersonRepository.findAll();
        return persons;
    }

    @Override
    public void savePerson(Person person) {
        iPersonRepository.save(person);
    }

    @Override
    public void deletePerson(Long id) {
        iPersonRepository.deleteById(id);
    }

    @Override
    public Person findPerson(Long id) {
        Person person = iPersonRepository.findById(id).orElse(null);
        return person;
    }
    
    
}

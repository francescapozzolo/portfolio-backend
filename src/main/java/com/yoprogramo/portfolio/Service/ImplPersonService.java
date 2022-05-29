package com.yoprogramo.portfolio.Service;

import com.yoprogramo.portfolio.Entity.Person;
import com.yoprogramo.portfolio.Interface.IPersonService;
import com.yoprogramo.portfolio.Repository.IPersonRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ImplPersonService implements IPersonService{
   
    @Autowired IPersonRepository iPersonRepository;
    
    @Override
    public List<Person> getPersons() {
        List<Person> persons = iPersonRepository.findAll();
        return persons;
    }

    @Override
    public Person savePerson(Person person) {
        Person newPerson = iPersonRepository.save(person);
        return newPerson;
    }

    @Override
    public void deletePerson(Long idPerson) {
        iPersonRepository.deleteById(idPerson);
    }

    @Override
    public Person findPersonById(Long idPerson) {
        Person person = iPersonRepository.findById(idPerson).orElse(null);
        return person;
    }
    
    
}

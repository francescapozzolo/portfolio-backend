package com.yoprogramo.portfolio.Controller;

import com.yoprogramo.portfolio.Entity.Person;
import com.yoprogramo.portfolio.Service.ImplPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/person")
public class PersonController {
    
    @Autowired
    private final ImplPersonService personService;

    public PersonController(ImplPersonService personService) {
        this.personService = personService;
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Person> getPersonById(@PathVariable("id") Long idPerson){
        Person person = personService.findPersonById(idPerson);
        return new ResponseEntity<>(person, HttpStatus.OK);
    };
    
    @PostMapping("/create")
    public ResponseEntity<Person> createPerson(@RequestBody Person person){
        Person newPerson = personService.savePerson(person);
        return new ResponseEntity<>(newPerson, HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Person> updatePerson(@RequestBody Person person){
        Person personUpdate = personService.savePerson(person);
        return new ResponseEntity<>(personUpdate,  HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePerson(@PathVariable("id") Long idPerson){
        personService.deletePerson(idPerson);
        return new ResponseEntity<>("Success",  HttpStatus.OK);
    } 
}

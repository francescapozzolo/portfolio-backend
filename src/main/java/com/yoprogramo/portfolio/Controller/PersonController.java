package com.yoprogramo.portfolio.Controller;

import com.yoprogramo.portfolio.Entity.Person;
import com.yoprogramo.portfolio.Service.ImplPersonService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/person")
public class PersonController {
    private final ImplPersonService personService;

    public PersonController(ImplPersonService personService) {
        this.personService = personService;
    }
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable("id") Long id){
        Person person = personService.findPerson(id);
        return new ResponseEntity<>(person, HttpStatus.OK);
    };
    
    @PostMapping("/create")
    public ResponseEntity<String> createPerson(@RequestBody Person person){
        personService.savePerson(person);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable("id") Long id, 
                                               @RequestBody Person person)
    {
        personService.savePerson(person);
        Person personUpdate = personService.findPerson(id);
        return new ResponseEntity<>(personUpdate,  HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deletePerson(@PathVariable("id") Long id){
        personService.deletePerson(id);
        return new ResponseEntity<>("Success",  HttpStatus.OK);
    } 
}

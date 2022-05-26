package com.yoprogramo.portfolio.Controller;

import com.yoprogramo.portfolio.Entity.Education;
import com.yoprogramo.portfolio.Service.ImplEducationService;
import java.util.List;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class EducationController {
    
    private final ImplEducationService educationService;

    public EducationController(ImplEducationService educationService) {
        this.educationService = educationService;
    }
    
    @GetMapping("/educations")
    public ResponseEntity<List> getEducations(){
        List<Education> educations = educationService.getEducations();
        return new ResponseEntity<>(educations, HttpStatus.OK);
    }
    
    @GetMapping("/education/{id}")
    public ResponseEntity<Education> getEducation(@PathVariable("id") Long id){
        Education education = educationService.findEducation(id);
        return new ResponseEntity<>(education, HttpStatus.OK);
    }
    
    @PostMapping("/education/create")
    public ResponseEntity<String> createEducation(@RequestBody Education education){
        educationService.saveEducation(education);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
    
    @PutMapping("/education/update/{id}")
    public ResponseEntity<Education> updateEducation(@RequestBody Education education, 
                                                       @PathVariable("id") Long id)
    {
        educationService.saveEducation(education);
        Education educationUpdate = educationService.findEducation(id);
        return new ResponseEntity<>(educationUpdate, HttpStatus.OK);
    }
    
    @DeleteMapping("/education/delete/{id}")
    public ResponseEntity<String> deleteEducation(@PathVariable("id") Long id){
        educationService.deleteEducation(id);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}

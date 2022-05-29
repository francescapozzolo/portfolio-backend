package com.yoprogramo.portfolio.Controller;

import com.yoprogramo.portfolio.Entity.Education;
import com.yoprogramo.portfolio.Service.ImplEducationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/education")
public class EducationController {
    
    @Autowired
    private final ImplEducationService educationService;

    public EducationController(ImplEducationService educationService) {
        this.educationService = educationService;
    }
    
    @GetMapping()
    public ResponseEntity<List<Education>> getEducations(){
        List<Education> educations = educationService.getEducations();
        return new ResponseEntity<>(educations, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Education> getEducationById(@PathVariable("id") Long idEducation){
        Education education = educationService.findEducationById(idEducation);
        return new ResponseEntity<>(education, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<Education> createEducation(@RequestBody Education education){
        Education newEducation = educationService.saveEducation(education);
        return new ResponseEntity<>(newEducation, HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Education> updateEducation(@RequestBody Education education){
        Education educationUpdate = educationService.saveEducation(education);
        return new ResponseEntity<>(educationUpdate, HttpStatus.OK);
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEducation(@PathVariable("id") Long idEducation){
        educationService.deleteEducation(idEducation);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

package com.yoprogramo.portfolio.Controller;

import com.yoprogramo.portfolio.Entity.Experience;
import com.yoprogramo.portfolio.Service.ImplExperienceService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExperienceController {
    
    private final ImplExperienceService experienceService;

    public ExperienceController(ImplExperienceService experienceService) {
        this.experienceService = experienceService;
    }
    
    @GetMapping("/experiences")
    public ResponseEntity<List> getExperiences(){
        List<Experience> experiences = experienceService.getExperiences();
        return new ResponseEntity<>(experiences, HttpStatus.OK);
    }
    
    @GetMapping("/experience/{id}")
    public ResponseEntity<Experience> getExperience(@PathVariable("id") Long id){
        Experience experience = experienceService.findExperience(id);
        return new ResponseEntity<>(experience, HttpStatus.OK);
    }
    
    @PostMapping("/experience/create")
    public ResponseEntity<String> createExperience(@RequestBody Experience experience){
        experienceService.saveExperience(experience);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
    
    @PutMapping("/experience/update/{id}")
    public ResponseEntity<Experience> updateExperience(@RequestBody Experience experience, 
                                                       @PathVariable("id") Long id)
    {
        experienceService.saveExperience(experience);
        Experience experienceUpdate = experienceService.findExperience(id);
        return new ResponseEntity<>(experienceUpdate, HttpStatus.OK);
    }
    
    @DeleteMapping("/experience/delete/{id}")
    public ResponseEntity<String> deleteExperience(@PathVariable("id") Long id){
        experienceService.deleteExperience(id);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}


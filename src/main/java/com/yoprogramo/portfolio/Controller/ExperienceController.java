package com.yoprogramo.portfolio.Controller;

import com.yoprogramo.portfolio.Entity.Experience;
import com.yoprogramo.portfolio.Service.ImplExperienceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/experience")
public class ExperienceController {
    
    @Autowired
    private final ImplExperienceService experienceService;

    public ExperienceController(ImplExperienceService experienceService) {
        this.experienceService = experienceService;
    }
    
    @GetMapping()
    public ResponseEntity<List<Experience>> getExperiences(){
        List<Experience> experiences = experienceService.getExperiences();
        return new ResponseEntity<>(experiences, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Experience> getExperienceById(@PathVariable("id") Long idExperience){
        Experience experience = experienceService.findExperienceById(idExperience);
        return new ResponseEntity<>(experience, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<Experience> createExperience(@RequestBody Experience experience){
        Experience newExperience = experienceService.saveExperience(experience);
        return new ResponseEntity<>(newExperience, HttpStatus.CREATED);
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Experience> updateExperience(@RequestBody Experience experience){
        Experience experienceUpdate = experienceService.saveExperience(experience);
        return new ResponseEntity<>(experienceUpdate, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteExperience(@PathVariable("id") Long idExperience){
        experienceService.deleteExperience(idExperience);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}


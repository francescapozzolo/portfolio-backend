package com.yoprogramo.portfolio.Controller;

import com.yoprogramo.portfolio.Entity.Skill;
import com.yoprogramo.portfolio.Service.ImplSkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/skill")
public class SkillController {
    
    @Autowired
    private final ImplSkillService skillService;

    public SkillController(ImplSkillService skillService) {
        this.skillService = skillService;
    }
    
    @GetMapping()
    public ResponseEntity<List<Skill>> getSkills(){
        List<Skill> skills = skillService.getSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Skill> getSkillById(@PathVariable("id") Long idSkill){
        Skill skill = skillService.findSkillById(idSkill);
        return new ResponseEntity<>(skill, HttpStatus.OK);
    }
    
    @PostMapping("/create")
    public ResponseEntity<Skill> createSkill(@RequestBody Skill skill){
        Skill newSkill = skillService.saveSkill(skill);
        return new ResponseEntity<>(newSkill, HttpStatus.CREATED);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Skill> updateSkill(@RequestBody Skill skill){
        Skill skillUpdate = skillService.saveSkill(skill);
        return new ResponseEntity<>(skillUpdate, HttpStatus.OK);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteSkill(@PathVariable("id") Long idSkill){
        skillService.deleteSkill(idSkill);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}

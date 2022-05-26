package com.yoprogramo.portfolio.Controller;

import com.yoprogramo.portfolio.Entity.Skill;
import com.yoprogramo.portfolio.Service.ImplSkillService;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class SkillController {
    
    private final ImplSkillService skillService;

    public SkillController(ImplSkillService skillService) {
        this.skillService = skillService;
    }
    
    @GetMapping("/skills")
    public ResponseEntity<List> getSkills(){
        List<Skill> skills = skillService.getSkills();
        return new ResponseEntity<>(skills, HttpStatus.OK);
    }
    
    @GetMapping("/skill/{id}")
    public ResponseEntity<Skill> getSkill(@PathVariable("id") Long id){
        Skill skill = skillService.findSkill(id);
        return new ResponseEntity<>(skill, HttpStatus.OK);
    }
    
    @PostMapping("/skill/create")
    public ResponseEntity<String> createSkill(@RequestBody Skill skill){
        skillService.saveSkill(skill);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
    
    @PutMapping("/skill/update/{id}")
    public ResponseEntity<Skill> updateSkill(@RequestBody Skill skill, 
                                             @PathVariable("id") Long id)
    {
        skillService.saveSkill(skill);
        Skill skillUpdate = skillService.findSkill(id);
        return new ResponseEntity<>(skillUpdate, HttpStatus.OK);
    }
    
    @DeleteMapping("skill/delete/{id}")
    public ResponseEntity<String> deleteSkill(@PathVariable("id") Long id){
        skillService.deleteSkill(id);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
}

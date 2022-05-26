package com.yoprogramo.portfolio.Service;

import com.yoprogramo.portfolio.Entity.Skill;
import com.yoprogramo.portfolio.Interface.ISkillService;
import com.yoprogramo.portfolio.Repository.ISkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplSkillService implements ISkillService{

    @Autowired ISkillRepository iSkillRepository;
    
    @Override
    public List<Skill> getSkills() {
        List<Skill> skills = iSkillRepository.findAll();
        return skills;
    }

    @Override
    public void saveSkill(Skill skill) {
        iSkillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        iSkillRepository.deleteById(id);
    }

    @Override
    public Skill findSkill(Long id) {
        Skill skill = iSkillRepository.findById(id).orElse(null);
        return skill;
    }
    
    
    
}

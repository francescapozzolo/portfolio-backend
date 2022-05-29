package com.yoprogramo.portfolio.Service;

import com.yoprogramo.portfolio.Entity.Skill;
import com.yoprogramo.portfolio.Interface.ISkillService;
import com.yoprogramo.portfolio.Repository.ISkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ImplSkillService implements ISkillService{

    @Autowired ISkillRepository iSkillRepository;
    
    @Override
    public List<Skill> getSkills() {
        List<Skill> skills = iSkillRepository.findAll();
        return skills;
    }

    @Override
    public Skill saveSkill(Skill skill) {
        Skill newSkill = iSkillRepository.save(skill);
        return newSkill;
    }

    @Override
    public void deleteSkill(Long idSkill) {
        iSkillRepository.deleteById(idSkill);
    }

    @Override
    public Skill findSkillById(Long idSkill) {
        Skill skill = iSkillRepository.findById(idSkill).orElse(null);
        return skill;
    }
    
}

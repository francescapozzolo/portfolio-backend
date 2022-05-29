package com.yoprogramo.portfolio.Interface;

import com.yoprogramo.portfolio.Entity.Skill;
import java.util.List;

public interface ISkillService {
    
    public List<Skill> getSkills();
    
    public Skill saveSkill(Skill skill);
    
    public void deleteSkill(Long idSkill);
    
    public Skill findSkillById(Long idSkill);
}

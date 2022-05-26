package com.yoprogramo.portfolio.Interface;

import com.yoprogramo.portfolio.Entity.Skill;
import java.util.List;

public interface ISkillService {
    
    public List<Skill> getSkills();
    
    public void saveSkill(Skill skill);
    
    public void deleteSkill(Long id);
    
    public Skill findSkill(Long id);
}

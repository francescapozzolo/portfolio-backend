package com.yoprogramo.portfolio.Interface;

import com.yoprogramo.portfolio.Entity.Experience;
import java.util.List;

public interface IExperienceService {

    public List<Experience> getExperiences();
    
    public Experience saveExperience(Experience experience);
    
    public void deleteExperience(Long idExperience);
    
    public Experience findExperienceById(Long idExperience);
    
}

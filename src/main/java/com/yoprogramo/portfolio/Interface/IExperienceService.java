package com.yoprogramo.portfolio.Interface;

import com.yoprogramo.portfolio.Entity.Experience;
import java.util.List;

public interface IExperienceService {

    public List<Experience> getExperiences();
    
    public void saveExperience(Experience experience);
    
    public void deleteExperience(Long id);
    
    public Experience findExperience(Long id);
    
}

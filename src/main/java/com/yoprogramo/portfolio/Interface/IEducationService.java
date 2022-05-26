package com.yoprogramo.portfolio.Interface;

import com.yoprogramo.portfolio.Entity.Education;
import java.util.List;

public interface IEducationService {
    
    public List<Education> getEducations();
    
    public void saveEducation(Education education);
    
    public void deleteEducation(Long id);
    
    public Education findEducation(Long id);
}

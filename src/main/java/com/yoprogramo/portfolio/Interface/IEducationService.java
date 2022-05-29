package com.yoprogramo.portfolio.Interface;

import com.yoprogramo.portfolio.Entity.Education;
import java.util.List;

public interface IEducationService {
    
    public List<Education> getEducations();
    
    public Education saveEducation(Education education);
    
    public void deleteEducation(Long idEducation);
    
    public Education findEducationById(Long idEducation);
}

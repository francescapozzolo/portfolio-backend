package com.yoprogramo.portfolio.Interface;

import com.yoprogramo.portfolio.Entity.Institution;
import java.util.List;

public interface IInstitutionService {
    
    public List<Institution> getInstitutions();
    
    public void saveInstitution(Institution institution);
    
    public void deleteInstitution(Long id);
    
    public Institution findInstitution(Long id);
    
}

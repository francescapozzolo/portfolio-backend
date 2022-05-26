package com.yoprogramo.portfolio.Service;

import com.yoprogramo.portfolio.Entity.Institution;
import com.yoprogramo.portfolio.Interface.IInstitutionService;
import com.yoprogramo.portfolio.Repository.IInstitutionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplInstitutionService implements IInstitutionService{

    @Autowired IInstitutionRepository iInstitutionRepository;
    
    @Override
    public List<Institution> getInstitutions() {
        List<Institution> institutions = iInstitutionRepository.findAll();
        return institutions;
    }

    @Override
    public void saveInstitution(Institution institution) {
        iInstitutionRepository.save(institution);
    }

    @Override
    public void deleteInstitution(Long id) {
        iInstitutionRepository.deleteById(id);
    }

    @Override
    public Institution findInstitution(Long id) {
        Institution institution = iInstitutionRepository.findById(id).orElse(null);
        return institution;
    }
    
    
}

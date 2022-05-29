package com.yoprogramo.portfolio.Service;

import com.yoprogramo.portfolio.Entity.Education;
import com.yoprogramo.portfolio.Interface.IEducationService;
import com.yoprogramo.portfolio.Repository.IEducationRepository;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ImplEducationService implements IEducationService{

    private final IEducationRepository iEducationRepository;
    
    public ImplEducationService(IEducationRepository iEducationRepository) {
        this.iEducationRepository = iEducationRepository;
    }
    
    @Override
    public List<Education> getEducations() {
        List<Education> educations = iEducationRepository.findAll();
        return educations;
    }

    @Override
    public Education saveEducation(Education education) {
        Education newEducation = iEducationRepository.save(education);
        return newEducation;
    }

    @Override
    public void deleteEducation(Long idEducation) {
        iEducationRepository.deleteById(idEducation);
    }

    @Override
    public Education findEducationById(Long idEducation) {
        Education education = iEducationRepository.findById(idEducation).orElse(null);
        return education;
    }
    
}

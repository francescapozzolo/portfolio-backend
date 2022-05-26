package com.yoprogramo.portfolio.Service;

import com.yoprogramo.portfolio.Entity.Education;
import com.yoprogramo.portfolio.Interface.IEducationService;
import com.yoprogramo.portfolio.Repository.IEducationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplEducationService implements IEducationService{

    @Autowired IEducationRepository iEducationyRepository;
    
    @Override
    public List<Education> getEducations() {
        List<Education> educations = iEducationyRepository.findAll();
        return educations;
    }

    @Override
    public void saveEducation(Education education) {
        iEducationyRepository.save(education);
    }

    @Override
    public void deleteEducation(Long id) {
        iEducationyRepository.deleteById(id);
    }

    @Override
    public Education findEducation(Long id) {
        Education education = iEducationyRepository.findById(id).orElse(null);
        return education;
    }
    
}

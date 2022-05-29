package com.yoprogramo.portfolio.Service;

import com.yoprogramo.portfolio.Entity.Experience;
import com.yoprogramo.portfolio.Interface.IExperienceService;
import com.yoprogramo.portfolio.Repository.IExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ImplExperienceService implements IExperienceService{

    @Autowired IExperienceRepository iExperienceRepository;
    
    @Override
    public List<Experience> getExperiences() {
        List<Experience> experiences = iExperienceRepository.findAll();
        return experiences;
    }

    @Override
    public Experience saveExperience(Experience experience) {
        Experience newExperience = iExperienceRepository.save(experience);
        return newExperience;
    }

    @Override
    public void deleteExperience(Long idExperience) {
        iExperienceRepository.deleteById(idExperience);
    }

    @Override
    public Experience findExperienceById(Long idExperience) {
        Experience experience = iExperienceRepository.findById(idExperience).orElse(null);
        return experience;
    }
    
    
}

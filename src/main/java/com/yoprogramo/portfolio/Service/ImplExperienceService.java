package com.yoprogramo.portfolio.Service;

import com.yoprogramo.portfolio.Entity.Experience;
import com.yoprogramo.portfolio.Interface.IExperienceService;
import com.yoprogramo.portfolio.Repository.IExperienceRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplExperienceService implements IExperienceService{

    @Autowired IExperienceRepository iExperienceRepository;
    
    @Override
    public List<Experience> getExperiences() {
        List<Experience> experiences = iExperienceRepository.findAll();
        return experiences;
    }

    @Override
    public void saveExperience(Experience experience) {
        iExperienceRepository.save(experience);
    }

    @Override
    public void deleteExperience(Long id) {
        iExperienceRepository.deleteById(id);
    }

    @Override
    public Experience findExperience(Long id) {
        Experience experience = iExperienceRepository.findById(id).orElse(null);
        return experience;
    }
    
    
}

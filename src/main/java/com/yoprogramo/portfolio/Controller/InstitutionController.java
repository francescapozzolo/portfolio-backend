package com.yoprogramo.portfolio.Controller;

import com.yoprogramo.portfolio.Service.ImplInstitutionService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InstitutionController {
    
    private final ImplInstitutionService institutionService;

    public InstitutionController(ImplInstitutionService institutionService) {
        this.institutionService = institutionService;
    }
    
}

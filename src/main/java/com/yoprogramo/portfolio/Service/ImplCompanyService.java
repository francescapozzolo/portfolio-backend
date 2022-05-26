package com.yoprogramo.portfolio.Service;

import com.yoprogramo.portfolio.Entity.Company;
import com.yoprogramo.portfolio.Interface.ICompanyService;
import com.yoprogramo.portfolio.Repository.ICompanyRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImplCompanyService implements ICompanyService{

    @Autowired ICompanyRepository iCompanyRepository;
    
    @Override
    public List<Company> getCompanies() {
        List<Company> companies = iCompanyRepository.findAll();
        return companies;
    }

    @Override
    public void saveCompany(Company company) {
        iCompanyRepository.save(company);
    }

    @Override
    public void deleteCompany(Long id) {
        iCompanyRepository.deleteById(id);
    }

    @Override
    public Company findCompany(Long id) {
        Company company = iCompanyRepository.findById(id).orElse(null);
        return company;
    }
    
}

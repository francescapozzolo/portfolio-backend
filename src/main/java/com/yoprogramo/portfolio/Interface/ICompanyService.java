package com.yoprogramo.portfolio.Interface;

import com.yoprogramo.portfolio.Entity.Company;
import java.util.List;

public interface ICompanyService {
    
    public List<Company> getCompanies();
    
    public void saveCompany(Company company);
    
    public void deleteCompany(Long id);
    
    public Company findCompany(Long id);
}

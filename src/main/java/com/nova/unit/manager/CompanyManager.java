package com.nova.unit.manager;

import com.nova.unit.dao.CompanyRepository;
import com.nova.unit.dto.CompanyDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanyManager {

    @Autowired
    private CompanyRepository companyDao;

    public List<CompanyDto> findCompany(){

        return companyDao.findAll().stream()
                .map(c-> new CompanyDto(c.getCompanyId(),c.getCompanyName()))
                .collect(Collectors.toList());
    }

}

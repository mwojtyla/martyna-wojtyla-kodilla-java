package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    private final Company company;
    private final Employee employee;

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    public Facade(Company company, Employee employee) {
        this.company = company;
        this.employee = employee;
    }

    public List<Company> findCompany(String partOfName){
        List<Company> companies = companyDao.retrieveCompaniesByPartOfTheName(partOfName);
        return companies;
    }

    public  List<Employee> findEmployee(String partOfName){
        List<Employee> employees = employeeDao.retrieveEmployeeByPartOfTheLastname(partOfName);
        return employees;
    }
}

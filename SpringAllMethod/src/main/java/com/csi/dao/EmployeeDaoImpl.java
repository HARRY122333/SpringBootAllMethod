package com.csi.dao;

import com.csi.model.Employee;
import com.csi.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EmployeeDaoImpl {

    @Autowired
    EmployeeRepo employeeRepo;

    public Employee signUp(Employee employee) {
        return employeeRepo.save(employee);
    }

    public boolean signIn(String empEmailId, String empPassword) {
       boolean flag=false;

List<Employee>employeeList=employeeRepo.findAll();
        for(Employee ee:employeeList){
            if(ee.getEmpEmailId().equals(empEmailId) && ee.getEmpPassword().equals(empPassword)){
                flag=true;
            }
        }
        return flag;
    }

    public List<Employee> saveAllData(List<Employee> employees) {
        return employeeRepo.saveAll(employees);
    }

    public List<Employee> getAllData() {
        return employeeRepo.findAll();
    }

  /*  public Employee getDataByName(String empName) {

        for (Employee e1 : employeeRepo.findAll()) {
            if (e1.getEmpName().equals(empName)) {
                return e1;
            }
        }
        return null;
    }*/

    public Employee getDataById(int empId) {

        for (Employee e2: employeeRepo.findAll()){
            if(e2.getEmpId()==(empId)){
                return e2;
            }
        }
        return null;
    }

    public Employee getDataByContactNumber(long empContactNumber){

    for (Employee e3: employeeRepo.findAll()){
        if(e3.getEmpContactNumber()==(empContactNumber)){
            return e3;
        }
    }
        return null;
    }

    public Employee updateData(Employee employee) {
    return employeeRepo.save(employee);
    }

    public void deleteDataById(int empId) {
         employeeRepo.deleteById(empId);
    }

    public void deleteAllData() {
         employeeRepo.deleteAll();
    }


}

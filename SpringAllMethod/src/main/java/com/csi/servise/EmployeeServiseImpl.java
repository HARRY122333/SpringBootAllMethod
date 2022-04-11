package com.csi.servise;

import com.csi.dao.EmployeeDaoImpl;
import com.csi.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiseImpl {

    @Autowired
    EmployeeDaoImpl employeeDao;

    public Employee signUp(Employee employee) {
        return employeeDao.signUp(employee);
    }

    public boolean signIn(String empEmailId, String empPassword) {
        return employeeDao.signIn(empEmailId,empPassword);
    }

    public List<Employee> saveAllData(List<Employee> employees) {
      return employeeDao.saveAllData(employees);
    }

    public List<Employee> getAllData() {
    return employeeDao.getAllData();
    }


    public Employee getDataById(int empId) {
        return employeeDao.getDataById(empId);
    }

    public Employee getDataByContactNumber(long empContactNumber) {
    return employeeDao.getDataByContactNumber(empContactNumber);
    }

    public Employee updateData(Employee employee) {
    return employeeDao.updateData(employee);
    }

    public void deleteDataById(int empId) {
     employeeDao.deleteDataById(empId);
    }

    public void deleteAllData() {
     employeeDao.deleteAllData();
    }
}

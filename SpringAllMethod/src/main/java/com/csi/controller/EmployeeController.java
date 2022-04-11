package com.csi.controller;


import com.csi.model.Employee;
import com.csi.servise.EmployeeServiseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    EmployeeServiseImpl employeeServise;

    @PostMapping("/signup")
    public String signUp(@RequestBody Employee employee) {
        employeeServise.signUp(employee);
        return "Data Saved Sucessfully";
    }
    @PostMapping("/signin/{empEmailId}/{empPassword}")
        public boolean signIn(@PathVariable String empEmailId,@PathVariable String empPassword){

        return employeeServise.signIn(empEmailId,empPassword);
    }

    @PostMapping("/savealldata")
    public String saveAllData(@RequestBody List <Employee>employees){
        employeeServise.saveAllData(employees);
    return "Data Saved Sucessfully";
    }

    @GetMapping("/getalldata")
    public List<Employee> getAllData(){
        return employeeServise.getAllData();
    }

    @GetMapping("/getdatabyid/{empId}")
    public Employee getDataById(@PathVariable int empId){
        return employeeServise.getDataById(empId);
    }


    @GetMapping("/getdatabycontactnumber/{empContactNumber}")
    public Employee getDataByContactNumber(@PathVariable long empContactNumber) {
        return employeeServise.getDataByContactNumber(empContactNumber);
    }
        @PutMapping("/updatedata/{empId}")
                public Employee updateData(@PathVariable int empId,@RequestBody Employee employee){
            return employeeServise.updateData(employee);
    }
@DeleteMapping("/deletedatabyid/{empId}")
    public String deleteDataById(@PathVariable int empId){
        employeeServise.deleteDataById(empId);
        return "Data Deleted Sucessfully";
}

@DeleteMapping("deletealldata")
    public String deleteAllData(){
employeeServise.deleteAllData();
return  "All Data Deleted Sucessfully";
}

}

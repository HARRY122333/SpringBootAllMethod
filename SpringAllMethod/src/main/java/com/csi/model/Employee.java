package com.csi.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@Data
public class Employee {

@GeneratedValue
    @Id

    private int empId;
private String empName;
private String empCity;
private String empEmailId;
private String empPassword;
private long empContactNumber;
private double empSalary;
private Date empDate;
private long empCode;
private String empState;


}

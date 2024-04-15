/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.HR_Manager;

import Shamik_Mondal_2221145.Employee;
import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author hp
 */
public class PaySalariesModelClass extends Employee implements Serializable {
      protected int year;
    protected long sal;
    protected String mon;
    
    public PaySalariesModelClass(int year, long sal, String mon, int employeeCode, String department, String address, LocalDate dateOfJoining, String name, String gender, String email, String userType, String password, LocalDate dateOfBirth, long contact) {
        super(employeeCode, department, address, dateOfJoining, name, gender, email, userType, password, dateOfBirth, contact);
        this.year = year;
        this.sal = sal;
        this.mon = mon;
    }
}

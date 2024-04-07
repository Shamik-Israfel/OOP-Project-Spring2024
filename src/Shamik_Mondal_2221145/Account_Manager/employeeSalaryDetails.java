/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

import java.io.Serializable;

/**
 *
 * @author hp
 */
public class employeeSalaryDetails implements Serializable {
    String name;
    Integer code;
    Double taxpercent;
    Integer bonus;
    String Department;

   


    public employeeSalaryDetails(String name, Integer code, Double taxpercent, Integer bonus, String Department) {
        this.name = name;
        this.code = code;
        this.taxpercent = taxpercent;
        this.bonus = bonus;
        this.Department = Department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Double getTaxpercent() {
        return taxpercent;
    }

    public void setTaxpercent(Double taxpercent) {
        this.taxpercent = taxpercent;
    }

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    @Override
    public String toString() {
        return "employeeSalaryDetails{" + "name=" + name + ", code=" + code + ", taxpercent=" + taxpercent + ", bonus=" + bonus + ", Department=" + Department + '}';
    }
    
    
}

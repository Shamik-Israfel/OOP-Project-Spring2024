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
public class AccManagerLeave implements Serializable{
     protected String name, department, status;
    protected int employeecode, selectdays;

    public AccManagerLeave(String name, String department, String status, int employeecode, int selectdays) {
        this.name = name;
        this.department = department;
        this.status = status;
        this.employeecode = employeecode;
        this.selectdays = selectdays;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getEmployeecode() {
        return employeecode;
    }

    public void setEmployeecode(int employeecode) {
        this.employeecode = employeecode;
    }

    public int getSelectdays() {
        return selectdays;
    }

    public void setSelectdays(int selectdays) {
        this.selectdays = selectdays;
    }
    public void setPermissionStatus(String req ){
        this.status = req;
    }

    @Override
    public String toString() {
        return "AccManagerLeave{" + "name=" + name + ", department=" + department + ", status=" + status + ", employeecode=" + employeecode + ", selectdays=" + selectdays + '}';
    }
}

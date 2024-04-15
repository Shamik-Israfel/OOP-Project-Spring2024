/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.HR_Manager;

import java.io.Serializable;

/**
 *
 * @author hp
 */
public class traineeModelClass implements Serializable{
            protected String name;
            protected int code;

    public traineeModelClass(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(int code) {
        this.code = code;
    }
@Override
    public String toString() {
        return "Employee name : " + name +  " Employee code :  " + code;
}
}
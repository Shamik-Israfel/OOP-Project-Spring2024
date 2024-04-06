/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.HR_Manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 *
 * @author hp
 */
public class HRleaveController implements Initializable{

    @FXML
    private TextField statusTextField;
    @FXML
    private ComboBox<Integer> daysCombobox;
    @FXML
    private TextField nameTextField;
    @FXML
    private ComboBox<String> departmentCombobox;
    @FXML
    private TextField codeTextField;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
       daysCombobox.getItems().addAll(1,2,3,4,5,6,7,14,30);
       departmentCombobox.getItems().addAll("Accounts", "President", "Human Resource", "Coach"); 
    }
    
    
    @FXML
    private void applyLeaveButtonOnClicked(ActionEvent event) {
        int days =  daysCombobox.getValue();
        String name = nameTextField.getText();
        int code = Integer.parseInt(codeTextField.getText());
        String dept =departmentCombobox.getValue();
        String stat = "Pending";
        
        HRLeaveModel leave = new HRLeaveModel(name,dept,stat,code,days);
        statusTextField.setText("Pending");
    }

    
}


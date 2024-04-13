/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

import Shamik_Mondal_2221145.ReadWrite;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class AccManagerLeaveController implements Initializable {

    @FXML
    private TextField accManStatusTextField;
    @FXML
    private ComboBox<Integer> accManDaysCombobox;
    @FXML
    private TextField accManNameTextField;
    @FXML
    private ComboBox<String> accManDepartmentCombobox;
    @FXML
    private TextField accManCodeTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        accManDaysCombobox.getItems().addAll(1,2,3,4,5,6,7,14,30);
       accManDepartmentCombobox.getItems().addAll("Accounts", "President", "Human Resource", "Coach"); 
    }    

    @FXML
    private void accManApplyLeaveButtonOnClicked(ActionEvent event) {
        
        int days =  accManDaysCombobox.getValue();
        String name =accManNameTextField.getText();
        int code = Integer.parseInt(accManCodeTextField.getText());
        String dept = accManDepartmentCombobox.getValue();
        String stat = "Pending";
        
        AccManagerLeave accleave = new AccManagerLeave(name,dept,stat,code,days);
                         ReadWrite.writeObjectToFile("ApplyLeave.bin", accleave);

        
        accManStatusTextField.setText("Pending");
        
        
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.HR_Manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author hp
 */
public class PaySalariesController {

    @FXML
    private TextField codeTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField salaryTextField;
    @FXML
    private ComboBox<?> monthComboBox;
    @FXML
    private ComboBox<?> yearComboBox;
    @FXML
    private TextArea checkStatusTextArea;
    @FXML
    private ComboBox<?> departmentCombobox;

    @FXML
    private void PayButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void departmentComboboxOnAction(ActionEvent event) {
    }
    
}

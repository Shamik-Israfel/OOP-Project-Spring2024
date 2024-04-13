/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.HR_Manager;

import Shamik_Mondal_2221145.ReadWrite;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author hp
 */
public class PaySalariesController implements Initializable {

    @FXML
    private TextField codeTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField salaryTextField;
    @FXML
    private ComboBox<String> monthComboBox;
    @FXML
    private ComboBox<Integer> yearComboBox;
    @FXML
    private TextArea checkStatusTextArea;
    @FXML
    private ComboBox<String> departmentCombobox;
    private ArrayList<PaySalariesModelClass> payList;
    private ObservableList<PaySalariesModelClass> ppayList;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        monthComboBox.getItems().addAll("January", "February", "March ", "April", "May", "June",
                "July", "August", "September", "October", "November", "December");
        yearComboBox.getItems().addAll(2023, 2024, 2025, 2026, 2027, 2028, 2029, 2030);
        departmentCombobox.getItems().addAll("Accounts", "President", "Human Resource", "Coach");
        payList = new ArrayList<PaySalariesModelClass>();

    }

    @FXML
    private void PayButtonOnClicked(ActionEvent event) {
        String name = nameTextField.getText();
        int code = Integer.parseInt(codeTextField.getText());
        String dept = departmentCombobox.getValue();
        String mon = monthComboBox.getValue();
        int year = yearComboBox.getValue();
        long sal = Long.parseLong(salaryTextField.getText());
        PaySalariesModelClass pay = new PaySalariesModelClass(year, sal, mon, code, dept, "address", null, name, "gender", "email", "Employee", "password", null, 0);
        payList.add(pay);
        
        
                ObservableList<PaySalariesModelClass> ppayList = (ObservableList<PaySalariesModelClass>) ReadWrite.readObjectToFile("EmployeeINFO", pay);

        
        checkStatusTextArea.setText("PAID");

        nameTextField.clear();
        codeTextField.clear();
        departmentCombobox.setValue(null);
        monthComboBox.setValue(null);
        yearComboBox.setValue(null);
        salaryTextField.clear();
    }

    @FXML
    private void departmentComboboxOnAction(ActionEvent event) {
    }

}

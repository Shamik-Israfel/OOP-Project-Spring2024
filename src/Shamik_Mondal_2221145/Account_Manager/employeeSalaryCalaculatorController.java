/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 *
 * @author hp
 */
public class employeeSalaryCalaculatorController {

    @FXML
    private TextField EmpIDTextField;
    @FXML
    private TextField NameTextField;
    @FXML
    private TextField BonusTextField;
    @FXML
    private ComboBox<Integer> TaxPercentCombobox;
    @FXML
    private TextArea SalaryOutputTextArea;
    @FXML
    private ComboBox<String> DepartmentCombobox;
    @FXML
    private Text EmployeeNameShow;
    @FXML
    private Text SalaryAmountShow;
    @FXML
    private TableView<?> calcDetailsTableView;
    @FXML
    private TableColumn<?, ?> detailsNameTableColumn;
    @FXML
    private TableColumn<?, ?> detailsCodeTableColumn;
    @FXML
    private TableColumn<?, ?> detailsTaxTableColumn;
    @FXML
    private TableColumn<?, ?> detailsBonusTableColumn;
    @FXML
    private TableColumn<?, ?> detailsDeptTableColumn;

    @FXML
    private void CalculateNetSalaryOnButtonClicked(MouseEvent event) {
    }

    @FXML
    private void departmentOnAction(ActionEvent event) {
    }

    @FXML
    private void SceneSwitchToPieChartButton(ActionEvent event) {
    }

    @FXML
    private void detailsButtonOnClicked(ActionEvent event) {
    }
    
}

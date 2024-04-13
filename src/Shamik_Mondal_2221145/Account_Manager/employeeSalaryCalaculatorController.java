/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

import Shamik_Mondal_2221145.ReadWrite;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;

/**
 *
 * @author hp
 */
public class employeeSalaryCalaculatorController implements Initializable {

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
    private TableView<employeeSalaryDetails> calcDetailsTableView;
    @FXML
    private TableColumn<employeeSalaryDetails, String> detailsNameTableColumn;
    @FXML
    private TableColumn<employeeSalaryDetails, Integer> detailsCodeTableColumn;
    @FXML
    private TableColumn<employeeSalaryDetails, Double> detailsTaxTableColumn;
    @FXML
    private TableColumn<employeeSalaryDetails, Integer> detailsBonusTableColumn;
    @FXML
    private TableColumn<employeeSalaryDetails, String> detailsDeptTableColumn;

    private ObservableList<Salary> salaryList;
    private ObservableList<Salary> salaryL;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        salaryL = FXCollections.observableArrayList();
        salaryList = FXCollections.observableArrayList();

        TaxPercentCombobox.getItems().addAll(5, 10, 15, 20);
        DepartmentCombobox.getItems().addAll("Accounts", "President", "Coach", "Human Resource", "Player");

        detailsNameTableColumn.setCellValueFactory(new PropertyValueFactory<employeeSalaryDetails, String>("name"));
        detailsCodeTableColumn.setCellValueFactory(new PropertyValueFactory<employeeSalaryDetails, Integer>("code"));
        detailsTaxTableColumn.setCellValueFactory(new PropertyValueFactory<employeeSalaryDetails, Double>("taxpercent"));
        detailsBonusTableColumn.setCellValueFactory(new PropertyValueFactory<employeeSalaryDetails, Integer>("bonus"));
        detailsDeptTableColumn.setCellValueFactory(new PropertyValueFactory<employeeSalaryDetails, String>("Department"));

    }

    @FXML
    private void CalculateNetSalaryOnButtonClicked(MouseEvent event) {
        int bonus = Integer.parseInt(BonusTextField.getText());
        int salary = Integer.parseInt(SalaryAmountShow.getText());
        int tax = TaxPercentCombobox.getValue();

        Salary obj = new Salary(salary, bonus, tax, 0, "", "", null, "", "", "", "", "", null, 0);
                              ReadWrite.writeObjectToFile("SalaryCalculator.bin", obj);

        salaryL.add(obj);
        salaryList.add(obj);
        int Total = 0;
        for (Salary y : salaryL) {
            Total += y.getNetSalary();
        }
        SalaryOutputTextArea.setText(Integer.toString(Total));
        EmployeeNameShow.setText(NameTextField.getText());
    }

    @FXML
    private void departmentOnAction(ActionEvent event) {
        String a = DepartmentCombobox.getValue();

        if ("Accounts".equals(a)) {
            SalaryAmountShow.setText("25000");
        } else if ("President".equals(a)) {
            SalaryAmountShow.setText("100000");
        } else if ("Administration".equals(a)) {
            SalaryAmountShow.setText("50000");
        } else if ("Human Resource".equals(a)) {
            SalaryAmountShow.setText("70000");
        } else if ("Player".equals(a)) {
            SalaryAmountShow.setText("30000");
        }
    }

    @FXML
    private void SceneSwitchToPieChartButton(ActionEvent event) {
    }

    @FXML
    private void detailsButtonOnClicked(ActionEvent event) throws IOException{
        String name = NameTextField.getText();
        int code = Integer.parseInt(EmpIDTextField.getText());
        double taxpercent = TaxPercentCombobox.getValue();
        int bonus = Integer.parseInt(BonusTextField.getText());
        String Department = DepartmentCombobox.getValue();

        employeeSalaryDetails dummySalaryDetails = new employeeSalaryDetails(name, code, taxpercent, bonus, Department);


        NameTextField.clear();
        EmpIDTextField.clear();
        BonusTextField.clear();
        TaxPercentCombobox.setValue(null);
        DepartmentCombobox.setValue(null);
          calcDetailsTableView.getItems().add(dummySalaryDetails);

    }
    

    
    
}

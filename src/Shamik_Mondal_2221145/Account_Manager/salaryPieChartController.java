/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author hp
 */
public class salaryPieChartController implements Initializable{

    @FXML
    private TextArea salaryTextAreaP;
    @FXML
    private TextField nameSalarypieTxtarea;
    private ComboBox<String> departmentComboBoxP;
    @FXML
    private PieChart salaryPieChartArea;
    private ObservableList<employeeSalaryDetails> salaryList;
    @FXML
    private ComboBox<?> salaryComboBoxP;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
                departmentComboBoxP.getItems().addAll("Accounts", "President", "Coach", "Human Resource", "Player");
          salaryList = FXCollections.observableArrayList();
    }
    
    @FXML
    private void showSalaryPieButtonOnclick(ActionEvent event) {
    }

    @FXML
    private void showSalaryPButtonOnClick(ActionEvent event) {
    }

}

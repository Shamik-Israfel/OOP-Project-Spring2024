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
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author hp
 */
public class Training_workshopsController implements Initializable {

    @FXML
    private TextField titleTextField;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField codeTextField;
    @FXML
    private DatePicker trainingDate;
    @FXML
    private TextArea detailsTextArea;
    @FXML
    private ComboBox<Integer> StartTimeComboBox;
    @FXML
    private ComboBox<String> amPmComboBox;
    @FXML
    private TableView<?> employeeListTableView;
    @FXML
    private TableColumn<?, ?> employeeNameTableColumn;
    @FXML
    private TableColumn<?, ?> employeeCodeTableColumn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    @FXML
    private void addEmployeeButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void showDetailsButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void downloadPdfButtonOnclicked(ActionEvent event) {
    }

    @FXML
    private void dashboardButtonOnClicked(ActionEvent event) {
    }

}

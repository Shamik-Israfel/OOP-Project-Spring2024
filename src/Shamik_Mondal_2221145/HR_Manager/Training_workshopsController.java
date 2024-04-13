/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.HR_Manager;

import Shamik_Mondal_2221145.ReadWrite;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

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
    private TableView<trainingModelClass> employeeListTableView;
    @FXML
    private TableColumn<trainingModelClass, String> employeeNameTableColumn;
    @FXML
    private TableColumn<trainingModelClass, Integer> employeeCodeTableColumn;
    
    private ObservableList<trainingModelClass> twlist;
    
   // private ObservableList<trainingModelClass> tmwlist;

    @Override
    public void initialize(URL url, ResourceBundle resources) {
        StartTimeComboBox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        amPmComboBox.getItems().addAll("AM", "PM");
        twlist = FXCollections.observableArrayList();
        employeeNameTableColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        employeeCodeTableColumn.setCellValueFactory(new PropertyValueFactory<>("code"));
    }

    @FXML
    private void addEmployeeButtonOnClicked(ActionEvent event) throws IOException {
        String n = nameTextField.getText();
        int c = Integer.parseInt(codeTextField.getText());

        trainingModelClass dummytrainee = new trainingModelClass(n, c);
        twlist.add(dummytrainee);
                ReadWrite.writeObjectToFile("newTrainingData.bin", twlist);

        employeeListTableView.setItems(twlist); 

        nameTextField.clear();
        codeTextField.clear();

    }

    @FXML
    private void showDetailsButtonOnClicked(ActionEvent event) {
        trainingModelClass tmwlist = new trainingModelClass("", 0);
        ObservableList<trainingModelClass> worklist = (ObservableList<trainingModelClass>) ReadWrite.readObjectToFile("newTrainingData.bin", tmwlist);
        for (trainingModelClass z : worklist) {
            detailsTextArea.appendText(z.toString2() + "\n");
            // System.out.println(z.toString());

            
        }
    }

    @FXML
    private void downloadPdfButtonOnclicked(ActionEvent event) {
    }

    @FXML
    private void dashboardButtonOnClicked(ActionEvent event) {
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.HR_Manager;

import Shamik_Mondal_2221145.ReadWrite;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;

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
   
    
    private ArrayList<trainingModelClass> twlist;;
    @FXML
    private TextArea employeeListTextArea;
    
   // private ObservableList<trainingModelClass> tmwlist;

    @Override
    public void initialize(URL url, ResourceBundle resources) {
        StartTimeComboBox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        amPmComboBox.getItems().addAll("AM", "PM");
       
       twlist = new ArrayList<>();
    }

    @FXML
    private void addEmployeeButtonOnClicked(ActionEvent event) throws IOException {
         String title = titleTextField.getText();
        String name = nameTextField.getText();
        int code = Integer.parseInt(codeTextField.getText());
        int startTime = StartTimeComboBox.getValue();
        String amPm = amPmComboBox.getValue();
        LocalDate tDate = trainingDate.getValue();

        trainingModelClass empList = new trainingModelClass(title, name, amPm, code, startTime, tDate);
        twlist.add(empList);
        
        //for (trainingModelClass xy : twlist) {
        ReadWrite.writeObjectToFile("TrainingData.bin", empList);
        //}
        nameTextField.clear();
        codeTextField.clear();

        employeeListTextArea.appendText(empList.toString() + "\n");

    }

    @FXML
    private void showDetailsButtonOnClicked(ActionEvent event) throws IOException{
       
        trainingModelClass empList = new trainingModelClass("", "", "", 0, 0, null);
        ObservableList<trainingModelClass> worklist = (ObservableList<trainingModelClass>) ReadWrite.readObjectToFile("TrainingData.bin", empList);
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

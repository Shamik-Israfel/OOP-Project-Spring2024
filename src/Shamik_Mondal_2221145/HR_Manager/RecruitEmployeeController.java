/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.HR_Manager;

import Shamik_Mondal_2221145.GeneratePDFModelClass;
import Shamik_Mondal_2221145.ReadWrite;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
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
public class RecruitEmployeeController implements Initializable{

    @FXML
    private TextField salaryRangeTextField;
    @FXML
    private TextField descriptionTextField;
    @FXML
    private TextField requirementTextField;
    @FXML
    private ComboBox<String> departmentComboBox;
    @FXML
    private TextArea outputTextArea;
    private ObservableList<jobRecruitModel> recList;
    private ObservableList<jobRecruitModel> readrecList;
    
     @Override
    public void initialize(URL location, ResourceBundle resources) {
    departmentComboBox.getItems().addAll("Accounts", "Cleaner", "Human Resource", "Administration");
        recList = FXCollections.observableArrayList();
        readrecList= FXCollections.observableArrayList();
    }
    
    
    
    @FXML
    private void showPostButtonOnClicked(ActionEvent event) {
           jobRecruitModel dummyrecruit = new jobRecruitModel("","","",0L);
        ObservableList<jobRecruitModel> readrecList= (ObservableList<jobRecruitModel>) ReadWrite.readObjectToFile("Recruit.bin", dummyrecruit);

        String add = "";
        for (jobRecruitModel r : readrecList) {
            //System.out.println(r.toString());
            add += r.toString();

        }
        outputTextArea.setText(add);
    }

    @FXML
    private void recruitmentPostButtonOnClicked(ActionEvent event) {
        
        String desc = descriptionTextField.getText();
        String req = requirementTextField.getText();
        long salary = Long.parseLong(salaryRangeTextField.getText());
        String dept = departmentComboBox.getValue();     
        
        jobRecruitModel recruit = new jobRecruitModel(dept,desc,req, salary);
        recList.add(recruit);
        
                ReadWrite.writeObjectToFile("Recruit.bin", recruit);

          descriptionTextField.clear();
        requirementTextField.clear();
        salaryRangeTextField.clear();
        departmentComboBox.setValue(null);
       
        }

    @FXML
    private void downloadPdfButtonOnClicked(ActionEvent event) {
        String a =outputTextArea.getText();
        GeneratePDFModelClass.generatePdf(a,"Job Required");
       
    }

   
    
}

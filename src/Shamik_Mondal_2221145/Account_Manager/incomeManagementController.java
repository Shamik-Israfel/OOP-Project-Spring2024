/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author hp
 */
public class incomeManagementController implements Initializable{

    @FXML
    private TextField sellingTicketsTextArea;
    @FXML
    private TextField sponsorDealsTextArea;
    @FXML
    private TextField broadcastRightsTextArea;
    @FXML
    private TextArea detailsTextArea;
    @FXML
    private ComboBox<Integer> yearIncComboBox;
    private ArrayList<incomeManagement> incList;    
    @FXML
    private Text yearText;
      private ObservableList<Salary> ss;
    
     @Override
    public void initialize(URL location, ResourceBundle resources) {
         yearIncComboBox.getItems().addAll(2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023);
 
       incList = new ArrayList<incomeManagement>();
        
       ss =FXCollections.observableArrayList();
        
    }
    
    
    
    

    @FXML
    private void totalIncomeButttonOnClick(ActionEvent event) {
        
        
        //Integer selectedYear = yearIncComboBox.getSelectionModel().getSelectedItem();

    // Check if a year is selected before proceeding
    
     
         incomeManagement IncomeManagement = new incomeManagement(
                        // Integer year = yearIncComboBox.getValue();
                 Double.parseDouble(sellingTicketsTextArea.getText()),
                Double.parseDouble(sponsorDealsTextArea.getText()),
                Double.parseDouble(broadcastRightsTextArea.getText())
                
         );
          
          //caluculatdAmountTextArea.setText(Integer.valueOf(incomeManagement.getTotalIncome()));
                 // caluculatdAmountTextArea.appendText(IncomeManagement.toString());
        yearText.setText(String.valueOf(yearIncComboBox.getSelectionModel().getSelectedItem()));
   
    detailsTextArea.appendText(IncomeManagement.toString());
    
    
    
    
    }

   
    
}

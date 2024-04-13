/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;

/**
 *
 * @author hp
 */
public class FinancialRiskManagementController implements Initializable{

    @FXML
    private ComboBox<String> riskNameComboBox;
    @FXML
    private ComboBox<String> descripFinancialRiskComboBox;
    @FXML
    private ComboBox<Double> riskProbabilityComboBox;
    @FXML
    private ComboBox<Double> impactComboBox;
    @FXML
    private TextArea riskTextArea;
   // private ObservableList<FinancialRisk> FRList;

     @Override
    public void initialize(URL location, ResourceBundle resources) {
                riskNameComboBox.getItems().addAll("Regulatory Changes","Revenue Dependency","Financial Mismanagement");
                riskNameComboBox.setValue("Choose an option");
                
                
                descripFinancialRiskComboBox.getItems().addAll(
                "Risks due to Financial Instability",
                "Risks due to Economic Downturn Impact",
                "Risks of Rugulatory Changes And Compliance Risks");
                descripFinancialRiskComboBox.setValue("Choose an option");
                
                
                riskProbabilityComboBox.getItems().addAll(0.7,0.5,0.4);
                riskProbabilityComboBox.setValue(Double.NaN);
                
                
                impactComboBox.getItems().addAll(0.8,0.6,0.7);
                impactComboBox.setValue(Double.NaN);
                
                
                
                
                
                
    }
    
    
    @FXML
    private void generatePDFButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void showFinancialRiskButtonOnClick(ActionEvent event) {
        
         String riskName =  riskNameComboBox.getValue();
        String description = descripFinancialRiskComboBox.getValue();
        double probability = riskProbabilityComboBox.getValue();
        double impact = impactComboBox.getValue();

        double riskScore = probability * impact;
        
        
         String riskStatus;
        if (riskScore >= 0.7) {
            riskStatus = "High Risk";
        } else if (riskScore >= 0.4) {
            riskStatus = "Medium Risk";
        } else {
            riskStatus = "Low Risk";
        }

        
              FinancialRisk risk = new FinancialRisk(riskName, description, probability, impact);
        //  ObservableList<FinancialRisk> empList = (ObservableList<FinancialRisk>) ReadWrite.readObjectToFile("EmployeeINFO", risk);

        
        String riskAnalysisReport = "Risk: " + riskName +
                                    "\nDescription: " + description +
                                    "\nprobability: " + probability +
                                    "\nImpact: " + impact +
                                    "\nRisk Score: " + riskScore +
                                    "\nRisk Status: " + riskStatus +
                                    "\n"+
                                    "\n"+
                                    "\n[RiskScore >= 0.7 = High Risk" +                                    
                                    "\nRiskScore >= 0.4 = Medium Risk" +
                                    "\nRiskScore <= 0.4 = Low Risk]" +"\n";

        
                riskTextArea.setText(riskAnalysisReport);

       
        
        
        
        
        
        
        
        
        
        
    }

   
    
}

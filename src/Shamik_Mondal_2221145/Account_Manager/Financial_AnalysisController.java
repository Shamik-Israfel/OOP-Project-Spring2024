/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

import Shamik_Mondal_2221145.ReadWrite;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class Financial_AnalysisController implements Initializable {

    @FXML
    private TextField totalIncomeTextField;
    @FXML
    private TextField totalExpenseTextField;
    @FXML
    private TextField averageTotalAssetsTextField;
    @FXML
    private TextArea financialAnalysisTextArea;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void generatePDFButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void showFinancialAnalysisButtonOnClick(ActionEvent event) {
        FinancialAnalysis financialAnalysis = new FinancialAnalysis(
                Double.parseDouble(totalIncomeTextField.getText()),
                Double.parseDouble(totalExpenseTextField.getText()),
                Double.parseDouble(averageTotalAssetsTextField.getText())
        );
        financialAnalysisTextArea.appendText(financialAnalysis.toString());
        ReadWrite.overWriteObjectToFile("FinancialAnalysis.bin", financialAnalysis);
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class Account_Manager_DashboardController implements Initializable {

    @FXML
    private BorderPane accBorderpaneId;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void financialAnalysisMenuItemOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("Financial_Analysis.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();

        newWindow.setTitle("Financial Analysis");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show(); 
    }

    @FXML
    private void financialRiskManagementMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void budgetManagementMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void incomeManagementMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void expenseTrackingSystemMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void employeeSalaryCalculatorMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void accApplyForLeaveMenuItemOnClick(ActionEvent event) {
    }

    @FXML
    private void accLogOutMenuItemClick(ActionEvent event) {
    }
    
}

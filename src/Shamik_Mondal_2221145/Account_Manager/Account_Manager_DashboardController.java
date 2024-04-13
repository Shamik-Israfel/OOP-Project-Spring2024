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
    private void financialRiskManagementMenuItemOnClick(ActionEvent event) throws IOException {
         Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("FinancialRiskManagement.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();

        newWindow.setTitle("Financial Risk Management");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void budgetManagementMenuItemOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("budgetManagement.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();

        newWindow.setTitle("Budget Management");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void incomeManagementMenuItemOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("IncomeManagement.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();

        newWindow.setTitle("Budget Management");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void expenseTrackingSystemMenuItemOnClick(ActionEvent event) throws IOException {
     Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("expensesTrackingSystem.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();

        newWindow.setTitle("Expenses Tracking System");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
   
        
    }

    @FXML
    private void employeeSalaryCalculatorMenuItemOnClick(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("employeeSalaryCalculator.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow = new Stage();

        newWindow.setTitle("Employee Salary Calculator");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }

    @FXML
    private void accApplyForLeaveMenuItemOnClick(ActionEvent event) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("AccManagerLeave.fxml"));
        accBorderpaneId.setRight(parent);
    }

    @FXML
    private void accLogOutMenuItemClick(ActionEvent event) throws IOException {
          Parent parent = FXMLLoader.load(getClass().getResource("AccManagerLogOut.fxml"));
        accBorderpaneId.setBottom(parent);
    }
    
}

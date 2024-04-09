/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;


public class budgetManagementController implements Initializable{

    @FXML
    private TextField budgetForAwayMatchesTextField;
    @FXML
    private TextField budgetForTransportationTextField;
    @FXML
    private TextField budgetForFoodAndWaterTextField;
    @FXML
    private TextField budgetFotKitExpenTextField;
    @FXML
    private TableView<budgetManagementModelClass> budgetTableVIew;
    @FXML
    private TableColumn<budgetManagementModelClass,Double> budForAwayMatchTableCol;
    @FXML
    private TableColumn<budgetManagementModelClass, Double> budgetFoodAndWaterTableCol;
    @FXML
    private TableColumn<budgetManagementModelClass, Double> budTransportationTableCol;
    @FXML
    private TableColumn<budgetManagementModelClass, Double> budKItExpenseTableCol;
    @FXML
    private TableColumn<budgetManagementModelClass, Double> totalBudTableCol;
    @FXML
    private TableColumn<budgetManagementModelClass, Double> percenForAwayMatchesTableCol;
    @FXML
    private TableColumn<budgetManagementModelClass, Double> percentFoodAndWaterTableCol;
    @FXML
    private TableColumn<budgetManagementModelClass, Double> percentTranspoBudTableCol;
    @FXML
    private TableColumn<budgetManagementModelClass, Double> perKitExpenditureTableCol;
    
    @FXML
    private ComboBox<String> budYearComboBox;
    @FXML
    private Text yearTextBud;
    

    
    
    
    
    public void initialize(URL url, ResourceBundle resources) {
       
        
        
budForAwayMatchTableCol.setCellValueFactory(new PropertyValueFactory<budgetManagementModelClass, Double>("approximateBudgetForAwayMatches"));
budgetFoodAndWaterTableCol.setCellValueFactory(new PropertyValueFactory<budgetManagementModelClass, Double>("approximateBudgetForFoodAndWaterSupply"));
budTransportationTableCol.setCellValueFactory(new PropertyValueFactory<budgetManagementModelClass, Double>("approximateBudgetForTransportation"));
budKItExpenseTableCol.setCellValueFactory(new PropertyValueFactory<budgetManagementModelClass, Double>("approximateBudgetForKitExpenditure"));
totalBudTableCol.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().totalBudget()).asObject());
percenForAwayMatchesTableCol.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().budpercentforAwayMatches()).asObject());
percentFoodAndWaterTableCol.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().budpercentforFoodAndWater()).asObject());
percentTranspoBudTableCol.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().budpercentforTranspo()).asObject());
perKitExpenditureTableCol.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().budpercentforKitAndExpend()).asObject());
    
        
        
        
        
        
        
     
        
        
        
        
        
        
        
    }
    @FXML
    private void budPDFDownloadButtonOnCLick(ActionEvent event) {
   
    
    
    }

    @FXML
    private void budDetaisButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void budBarChartButtonOnClick(ActionEvent event) {
    }

    
    
}

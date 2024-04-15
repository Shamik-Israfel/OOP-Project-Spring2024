/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

import Shamik_Mondal_2221145.ReadWrite;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

public class budgetManagementController implements Initializable {

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
    private TableColumn<budgetManagementModelClass, Double> budForAwayMatchTableCol;
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
    private ObservableList<budgetManagementModelClass> budList;
    @FXML
    private ComboBox<Integer> yearComboBoxBud;
    @FXML
    private Text yearTxtBuds;

    public void initialize(URL url, ResourceBundle resources) {

        yearComboBoxBud.getItems().addAll(2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023);

        budForAwayMatchTableCol.setCellValueFactory(new PropertyValueFactory<budgetManagementModelClass, Double>("approximateBudgetForAwayMatches"));
        budgetFoodAndWaterTableCol.setCellValueFactory(new PropertyValueFactory<budgetManagementModelClass, Double>("approximateBudgetForFoodAndWaterSupply"));
        budTransportationTableCol.setCellValueFactory(new PropertyValueFactory<budgetManagementModelClass, Double>("approximateBudgetForTransportation"));
        budKItExpenseTableCol.setCellValueFactory(new PropertyValueFactory<budgetManagementModelClass, Double>("approximateBudgetForKitExpenditure"));
        totalBudTableCol.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().totalBudget()).asObject());
        percenForAwayMatchesTableCol.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().budpercentforAwayMatches()).asObject());
        percentFoodAndWaterTableCol.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().budpercentforFoodAndWater()).asObject());
        percentTranspoBudTableCol.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().budpercentforTranspo()).asObject());
        perKitExpenditureTableCol.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().budpercentforKitAndExpend()).asObject());

        budList = FXCollections.observableArrayList();

    }

    @FXML
    private void budDetaisButtonOnClick(ActionEvent event) {
        double approximateBudgetForAwayMatches = Double.parseDouble(budgetForAwayMatchesTextField.getText());
        double approximateBudgetForFoodAndWaterSupply = Double.parseDouble(budgetForFoodAndWaterTextField.getText());
        double approximateBudgetForTransportation = Double.parseDouble(budgetForTransportationTextField.getText());
        double approximateBudgetForKitExpenditure = Double.parseDouble(budgetFotKitExpenTextField.getText());
        budgetManagementModelClass BudgetManagementModelClass = new budgetManagementModelClass(approximateBudgetForAwayMatches, approximateBudgetForFoodAndWaterSupply, approximateBudgetForTransportation, approximateBudgetForKitExpenditure);

        yearTxtBuds.setText(String.valueOf(yearComboBoxBud.getSelectionModel().getSelectedItem()));
        ReadWrite.writeObjectToFile("Budget.bin", BudgetManagementModelClass);
        //calculateTableView.getItems().addAll(IncomeManagement);
        budgetTableVIew.getItems().clear();
        budgetTableVIew.getItems().add(BudgetManagementModelClass);

    }

    @FXML
    private void budPDFDownloadButtonOnCLick(ActionEvent event) {
        budgetManagementModelClass Dummybud = new budgetManagementModelClass(0.0, 0.0, 0.0, 0.0);
        ObservableList<budgetManagementModelClass> budList = (ObservableList<budgetManagementModelClass>) ReadWrite.readObjectToFile("Budget.bin", Dummybud);
        budgetTableVIew.setItems(budList); // Set items to TableView

    }

    @FXML
    private void budBarChartButtonOnClick(ActionEvent event) {
    }

}

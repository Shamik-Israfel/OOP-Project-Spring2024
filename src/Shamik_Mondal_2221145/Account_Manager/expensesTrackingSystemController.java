/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

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

/**
 *
 * @author hp
 */
public class expensesTrackingSystemController implements Initializable {

    @FXML
    private TextField amountUsedForFoodAndWatersupplyTextField;
    @FXML
    private TextField amountOfKitsExpenditureTextField;
    @FXML
    private TextField amountForTraininigSessionTextField;
    @FXML
    private TextField amountUsedForTotalSalariesTextField;
    @FXML
    private ComboBox<Integer> YearExpComboBox;
    @FXML
    private Text expTextArea;
    @FXML
    private TableView<expensesTrackingSystemModelclass> totalExpenseDetailsTableView;
    @FXML
    private TableColumn<expensesTrackingSystemModelclass, Double> amountFoodandWatertableCol;
    @FXML
    private TableColumn<expensesTrackingSystemModelclass, Double> amountKitExpendituretableCol;
    @FXML
    private TableColumn<expensesTrackingSystemModelclass, Double> amountTrainingSessionTableCol;
    @FXML
    private TableColumn<expensesTrackingSystemModelclass, Double> amountEmployeeSalaryTableCol;
    @FXML
    private TableColumn<expensesTrackingSystemModelclass, Double> totalTableCol;
    @FXML
    private TableColumn<expensesTrackingSystemModelclass, Double> averageExpenseTableCol;
    @FXML
    private TableColumn<expensesTrackingSystemModelclass, Double> perFoodandWaterTableCol;
    @FXML
    private TableColumn<expensesTrackingSystemModelclass, Double> perKitExpenditureTableCol;
    @FXML
    private TableColumn<expensesTrackingSystemModelclass, Double> perTrainingSessionTableCol;
    @FXML
    private TableColumn<expensesTrackingSystemModelclass, Double> perEmployeeSaalaryTableCol;
    private ObservableList<incomeManagement> expList;

    @Override
    public void initialize(URL url, ResourceBundle resources) {
        YearExpComboBox.getItems().addAll(2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023);
        expList = FXCollections.observableArrayList();

        amountFoodandWatertableCol.setCellValueFactory(new PropertyValueFactory<expensesTrackingSystemModelclass, Double>("amountUsedForFoodAndWatersupply"));
        amountKitExpendituretableCol.setCellValueFactory(new PropertyValueFactory<expensesTrackingSystemModelclass, Double>("amountOfKitsExpenditure"));
        amountTrainingSessionTableCol.setCellValueFactory(new PropertyValueFactory<expensesTrackingSystemModelclass, Double>("amountForTraininigSession"));
        amountEmployeeSalaryTableCol.setCellValueFactory(new PropertyValueFactory<expensesTrackingSystemModelclass, Double>("amountUsedForTotalSalaries"));
        totalTableCol.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().TotAmountForExpenses()).asObject());
        averageExpenseTableCol.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().AvexpensesperCateg()).asObject());
        perFoodandWaterTableCol.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().PerOfExpFoodAndWaterSupply()).asObject());
        perKitExpenditureTableCol.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().PerOfExpByKitsExpenditure()).asObject());
        perTrainingSessionTableCol.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().PerOfExpByTraininigSession()).asObject());
        perEmployeeSaalaryTableCol.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().PerOfExpensesForToySal()).asObject());

    }

    @FXML
    private void totalExpensesDetailsButtonOnClick(ActionEvent event) {

        expensesTrackingSystemModelclass ExpensesTrackingSystemModelclass = new expensesTrackingSystemModelclass(
                Double.parseDouble(amountUsedForFoodAndWatersupplyTextField.getText()),
                Double.parseDouble(amountOfKitsExpenditureTextField.getText()),
                Double.parseDouble(amountForTraininigSessionTextField.getText()),
                Double.parseDouble(amountUsedForTotalSalariesTextField.getText())
        );

        expTextArea.setText(String.valueOf(YearExpComboBox.getSelectionModel().getSelectedItem()));

        totalExpenseDetailsTableView.getItems().addAll(ExpensesTrackingSystemModelclass);

    }

    @FXML
    private void expGeneratePieChartButtonOnClick(ActionEvent event) {
    }

}

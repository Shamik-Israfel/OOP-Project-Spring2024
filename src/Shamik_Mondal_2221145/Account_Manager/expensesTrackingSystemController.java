/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 *
 * @author hp
 */
public class expensesTrackingSystemController implements Initializable{

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

    
    @Override
    public void initialize(URL url, ResourceBundle resources) {
               YearExpComboBox.getItems().addAll(2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021,2022,2023);

    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    @FXML
    private void totalExpensesDetailsButtonOnClick(ActionEvent event) {
    }

    @FXML
    private void expGeneratePieChartButtonOnClick(ActionEvent event) {
    }

    
    
}

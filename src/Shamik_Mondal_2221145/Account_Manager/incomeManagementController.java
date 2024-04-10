/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

import Shamik_Mondal_2221145.ReadWrite;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;

/**
 *
 * @author hp
 */
public class incomeManagementController implements Initializable {

    @FXML
    private TextField sellingTicketsTextArea;
    @FXML
    private TextField sponsorDealsTextArea;
    @FXML
    private TextField broadcastRightsTextArea;
    @FXML
    private ComboBox<Integer> yearIncComboBox;
    // private ArrayList<incomeManagement> incList;    
    @FXML
    private Text yearText;
    private ObservableList<incomeManagement> incList;
    @FXML
    private TableView<incomeManagement> calculateTableView;
    @FXML
    private TableColumn<incomeManagement, Double> ticketsAmountTableColumn;
    @FXML
    private TableColumn<incomeManagement, Double> sponsorshipDealsAmountTableView;
    @FXML
    private TableColumn<incomeManagement, Double> broadcastsRightsAmountTableColumn;
    @FXML
    private TableColumn<incomeManagement, Double> totalIncomeTableColumn;
    @FXML
    private TableColumn<incomeManagement, Double> sellTickDistTableColumn;
    @FXML
    private TableColumn<incomeManagement, Double> sponDealsDistTableColumn;
    @FXML
    private TableColumn<incomeManagement, Double> broadRightsDistTableColumn;
    
    @Override
public void initialize(URL location, ResourceBundle resources) {
        yearIncComboBox.getItems().addAll(2010, 2011, 2012, 2013, 2014, 2015, 2016, 2017, 2018, 2019, 2020, 2021, 2022, 2023);

        ticketsAmountTableColumn.setCellValueFactory(new PropertyValueFactory<incomeManagement, Double>("sellingTickets"));
        sponsorshipDealsAmountTableView.setCellValueFactory(new PropertyValueFactory<incomeManagement, Double>("sponsorDeals"));
        broadcastsRightsAmountTableColumn.setCellValueFactory(new PropertyValueFactory<incomeManagement, Double>("broadcastsRights"));
        totalIncomeTableColumn.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().tIncome()).asObject());
        sellTickDistTableColumn.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().sellTicketsDist()).asObject());
        sponDealsDistTableColumn.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().sponDealsDist()).asObject());
        broadRightsDistTableColumn.setCellValueFactory(cellData -> new SimpleDoubleProperty(cellData.getValue().broadRightsDist()).asObject());

        incList = FXCollections.observableArrayList();

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

        ReadWrite.writeObjectToFile("Income.bin", IncomeManagement);
        //calculateTableView.getItems().addAll(IncomeManagement);
calculateTableView.getItems().clear(); // Clear existing items
calculateTableView.getItems().add(IncomeManagement); // Add the new item
    }

    @FXML
    private void incShowPreviousDataButtonOnClick(ActionEvent event) {
       
        incomeManagement DummyIncome =new incomeManagement(0,0,0);
             ObservableList<incomeManagement> incList = (ObservableList<incomeManagement>) ReadWrite.readObjectToFile("Income.bin", DummyIncome);
         calculateTableView.setItems(incList ); // Set items to TableView

        
                
    }

}

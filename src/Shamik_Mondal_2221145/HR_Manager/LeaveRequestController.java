/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.HR_Manager;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author hp
 */
public class LeaveRequestController implements Initializable {

    @FXML
    private TableView<HRLeaveModel> leaveRequestsTableView;
    @FXML
    private TableColumn<HRLeaveModel,Integer> codeTableColumn;
    @FXML
    private TableColumn<HRLeaveModel,String> nameTableColumn;
    @FXML
    private TableColumn<HRLeaveModel,String> departmentTableColumn;
    @FXML
    private TableColumn<HRLeaveModel, Integer> leaveDaysTableColumn;
    @FXML
    private TableColumn<HRLeaveModel,String> reqStatusTableColumn;

    private ObservableList<HRLeaveModel> reqlist;
    private ObservableList<HRLeaveModel> updatereqlist;
    
    
     @Override
    public void initialize(URL location, ResourceBundle resources) {
         reqlist=FXCollections.observableArrayList();
        updatereqlist = FXCollections.observableArrayList();
        
         nameTableColumn.setCellValueFactory(new PropertyValueFactory<HRLeaveModel, String>("name"));  
        codeTableColumn.setCellValueFactory(new PropertyValueFactory<HRLeaveModel, Integer>("employeecode"));
        reqStatusTableColumn.setCellValueFactory(new PropertyValueFactory<HRLeaveModel, String>("status"));
        departmentTableColumn.setCellValueFactory(new PropertyValueFactory<HRLeaveModel, String>("department"));
        leaveDaysTableColumn.setCellValueFactory(new PropertyValueFactory<HRLeaveModel, Integer>("selectdays"));
        
        HRLeaveModel dummyIns = new HRLeaveModel("","","",0,0); 
        
        leaveRequestsTableView.getItems().addAll(reqlist);
        
    }
    
    private void refreshTable(){
        // updatereqlist.clear();
        leaveRequestsTableView.getItems().clear();
        //updatereqlist = HR_Manager.acceptOrRejectPendingPermission(updatereqlist);//
        leaveRequestsTableView.getItems().addAll(reqlist);
    }
    
    
    
    @FXML
    private void acceptButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void rejectButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void showTableButtonOnClicked(ActionEvent event) {
    }
 //Shamik   

   
}

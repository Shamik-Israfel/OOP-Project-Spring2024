/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.HR_Manager;

import Shamik_Mondal_2221145.ReadWrite;
import java.io.IOException;
import java.util.ArrayList;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class Attendance_PerformanceController implements Initializable {

    @FXML
    private TextField nametextField;
    @FXML
    private TextField codeTextField;
    @FXML
    private ComboBox<String> departmentCombobox;
    @FXML
    private ComboBox<Integer> checkInCombobox;
    @FXML
    private ComboBox<Integer> checkOutCombobox;
    @FXML
    private DatePicker dateOfEntry;
    @FXML
    private TextField performanceNameTextField;
    @FXML
    private TextField performanceCodeTextField;
    @FXML
    private ComboBox<Integer> PerformanceScoreCombobox;
    @FXML
    private ComboBox<String> PerformanceDepartmentCombobox;
    @FXML
    private ComboBox<String> monthComboBox;
    @FXML
    private TableView<timeAttendanceModel> tableViewOfAttendance;

    @FXML
    private TableColumn<timeAttendanceModel, String> departmentColumn;
    @FXML
    private TableColumn<timeAttendanceModel, Integer> employeeCodeColumn;
    @FXML

    private TableColumn<timeAttendanceModel, Integer> checkInTimeColumn;
    @FXML
    private TableColumn<timeAttendanceModel, Integer> CheckOutTimeColumn;
    @FXML
    private TableColumn<timeAttendanceModel, Integer> workHoursColumn;
    @FXML
    private TableColumn<timeAttendanceModel, LocalDate> doeColumn;
    private ObservableList<timeAttendanceModel> AttendanceList;
    private ObservableList<timeAttendanceModel> ReadAttendanceList;
    private ObservableList<timePerformanceModel> perfList;
    private ObservableList<timePerformanceModel> readperfList;
    @FXML
    private TableColumn<timeAttendanceModel, String> employeeNameColumn;
    
    @FXML
    private TableView<timePerformanceModel> performanceTableView;
    @FXML
    private TableColumn<timePerformanceModel,String> performanceDeptColumn;
    @FXML
    private TableColumn<timePerformanceModel, String> performanceMonthColumn;
    @FXML
    private TableColumn<timePerformanceModel,Integer> performanceCodeColumn;
    @FXML
    private TableColumn<timePerformanceModel,Integer> performanceScoreColumn;
    @FXML
    private TableColumn<timePerformanceModel,String> peformanceEmployeeColumn;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        departmentCombobox.getItems().addAll("Accounts", "Coach", "Human Resource", "President","cleaner");
        PerformanceDepartmentCombobox.getItems().addAll("Accounts", "Coach", "Human Resource", "President");
        PerformanceScoreCombobox.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        checkInCombobox.getItems().addAll(9, 10, 11, 12, 13, 14, 15, 16, 17);
        checkOutCombobox.getItems().addAll(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22);
        monthComboBox.getItems().addAll("January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December");

        employeeNameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        checkInTimeColumn.setCellValueFactory(new PropertyValueFactory<>("checkin"));
        CheckOutTimeColumn.setCellValueFactory(new PropertyValueFactory<>("checkout"));
        employeeCodeColumn.setCellValueFactory(new PropertyValueFactory<>("code"));
        workHoursColumn.setCellValueFactory(new PropertyValueFactory<>("workhours"));
        doeColumn.setCellValueFactory(new PropertyValueFactory<>("doe"));

        AttendanceList = FXCollections.observableArrayList();
        ReadAttendanceList = FXCollections.observableArrayList();
        readperfList = FXCollections.observableArrayList();
        perfList = FXCollections.observableArrayList();
        
        peformanceEmployeeColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        performanceDeptColumn.setCellValueFactory(new PropertyValueFactory<>("perfDept"));
        performanceMonthColumn.setCellValueFactory(new PropertyValueFactory<>("month"));
        performanceCodeColumn.setCellValueFactory(new PropertyValueFactory<>("code"));
        performanceScoreColumn.setCellValueFactory(new PropertyValueFactory<>("score"));
        
        
        
            performanceTableView.setItems(perfList);

    }

    @FXML
    private void addShowButtonOnClicked(ActionEvent event) throws IOException{
        String name = nametextField.getText();
        int code = Integer.parseInt(codeTextField.getText());
        int chkin = checkInCombobox.getValue();
        int chkout = checkOutCombobox.getValue();
        String dept = departmentCombobox.getValue();
        LocalDate entry = dateOfEntry.getValue();
        int work = Math.abs(chkout - chkin);

        timeAttendanceModel Attendance = new timeAttendanceModel(name, dept, chkin, chkout, code, work, entry);
        AttendanceList.add(Attendance);
        ReadWrite.writeObjectToFile("Attendance.bin", Attendance);
        tableViewOfAttendance.getItems().add(Attendance);

        nametextField.clear();
        codeTextField.clear();
        checkInCombobox.setValue(null);
        checkOutCombobox.setValue(null);
        departmentCombobox.setValue(null);
        dateOfEntry.setValue(null);
    }

    @FXML
    private void showPerformanceScoreButtonOnClicked(ActionEvent event)throws IOException {
                timePerformanceModel performancedummy = new timePerformanceModel("", "", "", 0, 0);

        readperfList = (ObservableList<timePerformanceModel>) ReadWrite.readObjectToFile("PerformanceList.bin", performancedummy);

        //System.out.println(readperfList.size());
        String add = "";
        for (timePerformanceModel perf : readperfList) {
            //System.out.println(perf.toString());
            add += perf.toString();

        }
        
            
            
            performanceTableView.getItems().add(performancedummy);
        }
    

    @FXML
    private void addPerformanceScoreButtonOnClicked(ActionEvent event) throws IOException{
        performanceTableView.getItems().clear();
       
        
           String name = performanceNameTextField.getText();
        int code = Integer.parseInt(performanceCodeTextField.getText());
        String pdept = PerformanceDepartmentCombobox.getValue();
        int score = PerformanceScoreCombobox.getValue();
        String mon = monthComboBox.getValue();

        timePerformanceModel performance = new timePerformanceModel(name, pdept, mon, code, score);
        //System.out.println(performance.toString2());
        ReadWrite.writeObjectToFile("PerformanceList.bin", performance);

        perfList.add(performance);

        performanceNameTextField.clear();
        performanceCodeTextField.clear();
        PerformanceDepartmentCombobox.setValue(null);
        PerformanceScoreCombobox.setValue(null);
        monthComboBox.setValue(null);
        
        
    }

    @FXML
    private void sendButtonOnClicked(ActionEvent event) {
        tableViewOfAttendance.getItems().clear();
        timeAttendanceModel Attendancedummy = new timeAttendanceModel("", "", 0, 0, 0, 0, LocalDate.of(2023, 02, 02));
        ObservableList<timeAttendanceModel> ReadAttendanceList = (ObservableList<timeAttendanceModel>) ReadWrite.readObjectToFile("Attendance.bin", Attendancedummy);
        tableViewOfAttendance.getItems().addAll(ReadAttendanceList);
      
    }

    @FXML
    private void pieChartButtonOnClicked(ActionEvent event) {
    }

}

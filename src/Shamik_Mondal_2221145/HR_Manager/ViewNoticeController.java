/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.HR_Manager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

/**
 *
 * @author hp
 */
public class ViewNoticeController {

    @FXML
    private TableView<?> noticeTableView;
    @FXML
    private TableColumn<?, ?> noticeNameTableColumn;
    @FXML
    private TableColumn<?, ?> noticeDateTableColumn;
    @FXML
    private TableColumn<?, ?> noticeSubjectTableColumn;
    @FXML
    private TextArea loadNoticeTextArea;

    @FXML
    private void loadNoticeButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void downloadPdfButtonOnClicked(ActionEvent event) {
    }

    @FXML
    private void refreshButtonOnClick(ActionEvent event) {
    }
    
}

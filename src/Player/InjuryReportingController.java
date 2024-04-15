/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Player;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

/**
 * FXML Controller class
 *
 * @author User
 */
public class InjuryReportingController implements Initializable {

    @FXML
    private TextArea injuryTypeTextArea;
    @FXML
    private TextArea injurySeverityTextArea;
    @FXML
    private Label selectedFileLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void uploadDocument(ActionEvent event) {
    }

    @FXML
    private void backToDashboard(ActionEvent event) {
    }

    
}

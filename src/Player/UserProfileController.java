/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Player;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class UserProfileController implements Initializable {

    @FXML
    private TextField nameTextField;
    @FXML
    private TextField heightTextField;
    @FXML
    private TextField dobTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField phoneTextField;
    @FXML
    private TextField yearsActiveTextField;
    @FXML
    private TextField playingPositionTextField;
    @FXML
    private TextField matchesPlayedTextField;
    @FXML
    private TextField goalsScoredTextField;
    @FXML
    private TextField redCardsTextField;
    @FXML
    private TextField yellowCardsTextField;
    @FXML
    private TextField assistsTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void editOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void dashboardOnMouseClicked(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
}

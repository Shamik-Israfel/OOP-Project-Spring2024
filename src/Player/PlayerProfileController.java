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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class PlayerProfileController implements Initializable {

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
     * @param url
     * @param rb
     * 
     */
        
    private Stage stage;

    // Set the stage
    public void setStage(Stage stage) {
        this.stage = stage;
    }

    // Method to load scene from FXML file
    private void loadScene(String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void editOnMouseClicked(ActionEvent event) {
    }

    @FXML
    private void dashboardOnMouseClicked(ActionEvent event) {
        loadScene("Dashboard.fxml");
    }
    
}

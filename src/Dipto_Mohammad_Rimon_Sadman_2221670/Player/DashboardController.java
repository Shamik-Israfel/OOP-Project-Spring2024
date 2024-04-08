/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Dipto_Mohammad_Rimon_Sadman_2221670.Player;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {

    @FXML
    private Stage stage;

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

    @FXML
    private void userProfileOnMouseClicked() {
        loadScene("userProfile.fxml");
    }

    @FXML
    private void trainingMaterialsOnMouseClicked() {
        loadScene("trainingMaterials.fxml");
    }

    @FXML
    private void calendarOnMouseClicked() {
        loadScene("calendar.fxml");
    }

    @FXML
    private void performanceTrackingOnMouseClicked() {
        loadScene("performanceTracking.fxml");
    }

    @FXML
    private void playersProfileOnMouseClicked() {
        loadScene("playersProfile.fxml");
    }

    @FXML
    private void communicationOnMouseClicked() {
        loadScene("communication.fxml");
    }

    @FXML
    private void injuryReportingOnMouseClicked() {
        loadScene("injuryReporting.fxml");
    }
    
    @FXML
    private void matchAnalysisOnMouseClicked() {
        loadScene("matchAnalysis.fxml");
    }

    void setStage(Stage primaryStage) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

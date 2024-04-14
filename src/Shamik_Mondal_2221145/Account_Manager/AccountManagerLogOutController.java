/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145.Account_Manager;

import Shamik_Mondal_2221145.GenerateAlerts;
import Shamik_Mondal_2221145.SceneSwitching;
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
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class AccountManagerLogOutController implements Initializable{

    @FXML
    private Button accLogOutButton;

    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
    
    
    
    @FXML
    private void AccManagerLogOutButtonOnClick(ActionEvent event) throws IOException {
       accLogOutButton.getScene().getWindow().hide();
        Stage login = new Stage();
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/Shamik_Mondal_2221145/LoginScene.fxml"));
            Scene scene = new Scene(root);
            login.setScene(scene);
            login.setResizable(false);
            login.show();
            // Create a object For using Label which is located login scene    
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        
    }

    
}


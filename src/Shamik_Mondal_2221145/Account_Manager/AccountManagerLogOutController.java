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
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class AccountManagerLogOutController implements Initializable{

    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }
    
    
    
    
    @FXML
    private void AccManagerLogOutButtonOnClick(ActionEvent event) throws IOException {
        SceneSwitching newscene = new SceneSwitching();
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        if ( GenerateAlerts.confirmationAlert() ) {
        newscene.logOutSceneSwitching(stage);
        GenerateAlerts.successfulAlert("Remember, logging out is the only time we can all agree on 'balancing the books!" + "\n" + "Please visit Again"); }
    
    }
        
        
        
    }

    
    


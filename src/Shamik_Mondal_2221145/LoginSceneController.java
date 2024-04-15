/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Shamik_Mondal_2221145;
import Shamik_Mondal_2221145.SceneSwitching;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class LoginSceneController implements Initializable {

    @FXML
    private ComboBox<String> userComboBox;
    @FXML
    private TextField getEmailTextField;
    @FXML
    private PasswordField passwordTextField;

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        userComboBox.getItems().addAll("Player","President",
                "HR Manager", "Account Manager", "Coach", "Supplier","Sponsor","Physiotherapist");
    }    
    
    
    
    @FXML
    private void logInButton(ActionEvent event) throws IOException {
     String user = userComboBox.getValue();
        SignupData signup = new SignupData(0, "", "", "", "", LocalDate.of(2023, 03, 10));
        ObservableList<SignupData> signupList = (ObservableList<SignupData>) ReadWrite.readObjectToFile("SignupData.bin", signup);
        for (SignupData xy : signupList) {
            //System.out.println(xy.toString());
            if (xy.getEmail().equals(getEmailTextField.getText()) && xy.getPassword().equals(passwordTextField.getText())) {
                if (user.equals("HR Manager")) {
                   
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    SceneSwitching newScene = new SceneSwitching();
                    newScene.sceneSwitchingWithoutDataPassing(stage,"/Shamik_Mondal_2221145/HR_Manager/HR_Manager_Dashboard.fxml");
                }
                else if (user.equals("Accounts Officer")) {
                   
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    SceneSwitching newScene = new SceneSwitching();
                    newScene.sceneSwitchingWithoutDataPassing(stage,"/Shamik_Mondal_2221145/Account_Manager/Account_Manager_Dashboard.fxml");  
                }
                else if (user.equals("Coach")) {
                   
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    SceneSwitching newScene = new SceneSwitching();
                    newScene.sceneSwitchingWithoutDataPassing(stage,"");  
                }
                else if (user.equals("Supplier")) {
                   
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    SceneSwitching newScene = new SceneSwitching();
                    newScene.sceneSwitchingWithoutDataPassing(stage,"Supplier_Dashboard.fxml");  
                }
                else if (user.equals("Player")) {
                   
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    SceneSwitching newScene = new SceneSwitching();
                    newScene.sceneSwitchingWithoutDataPassing(stage,"Player_Dashboard.fxml");  
                }
                
                else if (user.equals("Physiotherapist")) {
                   
                    Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

                    SceneSwitching newScene = new SceneSwitching();
                    newScene.sceneSwitchingWithoutDataPassing(stage,"");  
                }
            }

        }
    }   
    

    @FXML
    private void forgetPasswordButton(ActionEvent event) {
    }

    @FXML
    private void signUpButton(ActionEvent event) 
    throws IOException {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        SceneSwitching newScene = new SceneSwitching();
        newScene.sceneSwitchingWithoutDataPassing(stage, "Signup.fxml");
    }
    
}
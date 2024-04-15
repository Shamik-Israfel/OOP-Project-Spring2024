/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Shamik_Mondal_2221145;

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
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author hp
 */
public class SignupController implements Initializable {

    @FXML
    private RadioButton maleRadioBtn;
    @FXML
    private ComboBox<String> selectUserCombobox;
    @FXML
    private RadioButton femaleRadioBtn;
    @FXML
    private TextField nameTextField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField contactTextField;
    @FXML
    private DatePicker dateOfBirth;
    @FXML
    private PasswordField passwordTextField;
    private ToggleGroup tg;
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
     tg = new ToggleGroup();
        maleRadioBtn.setToggleGroup(tg);
        femaleRadioBtn.setToggleGroup(tg);
  selectUserCombobox.getItems().addAll("Player","President",
                "HR Manager", "Account Manager", "Coach", "Supplier","Sponsor","Physiotherapist");
    }    
       

    @FXML
    private void createAccountButtonONClick(ActionEvent event) throws IOException {
        try{
        String name = nameTextField.getText();
        String email =emailTextField.getText();
        String pass = passwordTextField.getText();
        
        if ( validationAndVerificaton.isValidEmail(email) ){}
        else {
            GenerateAlerts.unsuccessfulAlert("Invalid Email");
            throw new RuntimeException();
            }
         if ( validationAndVerificaton.isValidPassword(pass) ){}
        else {
            GenerateAlerts.unsuccessfulAlert("Invalid Password");
            throw new RuntimeException();
            }
        
       
        
        String User = selectUserCombobox.getValue();        
        long contact=Long.parseLong(contactTextField.getText());
        String gender;
                if (maleRadioBtn.isSelected()){ gender = "Male";}
                  else gender = "Female";
                
        SignupData data = new SignupData(contact,name,email,User,pass,dateOfBirth.getValue());
        //System.out.println(data.toString());
        
        if ( GenerateAlerts.confirmationAlert() ){
            ReadWrite.writeObjectToFile("SignupData.bin", data);}
         GenerateAlerts.successfulAlert("Account created Successfully");
        }
       
        catch(Exception e){
        GenerateAlerts.unsuccessfulAlert("Data incorrect");
        }
        nameTextField.clear();
        emailTextField.clear();
        passwordTextField.clear();
        tg =null;
        contactTextField.clear();
        selectUserCombobox = null;   
        dateOfBirth = null;
    }     

    @FXML
    private void backToLoginButtonONClick(ActionEvent event) {
    }
    }

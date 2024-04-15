/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Player;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Slider;
import javafx.scene.media.MediaView;

/**
 * FXML Controller class
 *
 * @author User
 */
public class MatchAnalysisController implements Initializable {

    @FXML
    private MediaView matchVideoView;
    @FXML
    private ProgressBar passesProgressBar;
    @FXML
    private Slider goalsSlider;
    @FXML
    private ProgressBar possessionTeamAProgressBar;
    @FXML
    private ProgressBar possessionTeamBProgressBar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}

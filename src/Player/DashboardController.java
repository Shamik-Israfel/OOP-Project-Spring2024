package Player;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class DashboardController implements Initializable {

    @FXML
    public Label welcomeLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        welcomeLabel.setText("Welcome to Dashboard");
    }    

    @FXML
    private void useProfileOnMouseClicked(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("userProfile.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void traingMaterialsOnMouseClicked(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("TrainingMaterials.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void calendarOnMouseClicked(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Calendar.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void communicationOnMouseClicked(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Communication.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void injuryReportingOnMouseClicked(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("InjuryReporting.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void performanceTrackingOnMouseClicked(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PerformanceTracking.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void playersProfileOnMouseClicked(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PlayersProfile.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void matchAnalysisOnMouseClicked(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("MatchAnalysis.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

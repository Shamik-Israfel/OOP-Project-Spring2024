package sponsor;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author ARABI
 */
public class Dashboard_sponsorController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void financialSupportTrackerOnMouseClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FinancialSupportTracker.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    

    @FXML
    private void brandVisibilityOnMouseClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("BrandVisibility.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void partnershipEngagementOnMouseClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PartnershipEngagement.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void sponsorshipReportingOnMouseClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("SponsorshipReporting.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void audienceConnectionOnMouseClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("AudienceConnection.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void communicationOnMouseClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Communication.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void eventCollaborationOnMouseClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("EventCollaboration.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void timelyUpdatesOnMouseClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TimelyUpdates.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    
}

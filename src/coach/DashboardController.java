package coach;

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
public class DashboardController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    @FXML
    private void playerManagementOnMouseClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PlayerManagement.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void trainingSessionManagementOnMouseClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("TrainingSessionManagement.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void orderEquipmentOnMouseClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("OrderEquipments.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void performanceAnalysisOnMouseClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PerformanceAnalysis.fxml"));
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
    private void injuryTrackingOnMouseClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("InjuryTracker.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void performanceFeedbackOnMouseClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("PerformanceFeedback.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void calendarOnMouseClicked(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Calendar.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    
}

package Supplier;

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
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author User
 */
public class HomeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

   @FXML
    private void catalogOnMouseClicked(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Catalog.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void orderOnMouseClicked(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("OrderManagement.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void paymentStatusOnMouseClicked(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("PaymentStatus.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void salesReportOnMouseClicked(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("SalesReport.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void logOutOnMouseClicked(ActionEvent event) {
        // Handle logout functionality, if needed
    }

    @FXML
    private void shipmentOnMouseClicked(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Shipping.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void invoiceOnMouseClicked(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("Invoices.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void customerSupportOnMouseClicked(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("CustomerSupport.fxml"));
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package Supplier;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleFloatProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class InvoicesController implements Initializable {
    @FXML
    private ComboBox<String> selectProductComboBox;
    @FXML
    private TextField rateTextFeild;
    @FXML
    private ComboBox<Integer> quantityComboBox;
    @FXML
    private TextField vatTextField;
    @FXML
    private TableView<Invoices> tableVIew;
    @FXML
    private TableColumn<Invoices, String> productNameCol;
    @FXML
    private TableColumn<Invoices, Integer> quantityCol;
    @FXML
    private TableColumn<Invoices, Float> vatCol;
    @FXML
    private TableColumn<Invoices, Float> vatAmountCol;
    @FXML
    private TableColumn<Invoices, Float> grossTotalCol;
    @FXML
    private Label totalPayableTextField;
    @FXML
    private TextField NameTextFeild;
    @FXML
    private ComboBox<String> CityComboBox;
    @FXML
    private DatePicker dueDate;
    @FXML
    private TextField contactTextFeild;
    @FXML
    private TextArea personalDetailsTextArea;
    @FXML
    private TableColumn<Invoices, Float> rateCol;
    private ArrayList<Invoices> InvoiceList;
    private final float[] predefinedPrices = {500.0f, 750.0f, 1200.0f, 2000.0f, 3200.0f, 900.0f, 1500.0f, 200.0f};
    private final int[] predefinedVat = {3, 5, 3, 5, 1, 0, 5, 4};
    private int invoiceCounter = 1;
    private static boolean clientDataEntered = false;
    private Button BACK;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        selectProductComboBox.getItems().addAll("Water Bottle", "Pratice Cones", "Glooves",
        "Football", "Boots", "Jersy", "Gear Bag", "Miscellaneous Socks");

        quantityComboBox.getItems().addAll(1, 2, 3);

        selectProductComboBox.setOnAction(this::handleProductSelection);

        CityComboBox.getItems().addAll("Dhaka", "CTG", "Cumilla", "Barisal", "Sylhet", "Khulna", "Rajshahi");

        invoiceCounter = Invoices.findHighestInvoiceNumber(totalPayableTextField, invoiceCounter);

        InvoiceList = new ArrayList<>();

        productNameCol.setCellValueFactory(new PropertyValueFactory<>("productName"));
        rateCol.setCellValueFactory(new PropertyValueFactory<>("rate"));
        quantityCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        vatCol.setCellValueFactory(new PropertyValueFactory<>("vatRate"));

        vatAmountCol.setCellValueFactory(cellData -> {
            float rate = cellData.getValue().getRate();
            int quantity = cellData.getValue().getQuantity();
            float vatRate = cellData.getValue().getVatRate();
            float vatAmount = (rate * quantity * vatRate) / 100;
            return new SimpleFloatProperty(vatAmount).asObject();
        });

        grossTotalCol.setCellValueFactory(cellData -> {
            float rate = cellData.getValue().getRate();
            int quantity = cellData.getValue().getQuantity();
            float vatRate = cellData.getValue().getVatRate();
            float vatAmount = (rate * quantity * vatRate) / 100;
            float grossTotal = (rate * quantity) + vatAmount;
            return new SimpleFloatProperty(grossTotal).asObject();
        });

        Invoices.findHighestInvoiceNumber(totalPayableTextField, invoiceCounter);
    }

    @FXML
    private void addToTableOnClick(ActionEvent event) {
        if (selectProductComboBox.getSelectionModel().isEmpty() || quantityComboBox.getSelectionModel().isEmpty()) {
            showAlert("Error", "Please select a product and quantity before adding items to the table.");
            return;
        }
        Invoices.addToTable(selectProductComboBox, quantityComboBox, predefinedPrices, predefinedVat, InvoiceList, clientDataEntered, rateTextFeild, vatTextField);
        selectProductComboBox.getSelectionModel().clearSelection();
        quantityComboBox.getSelectionModel().clearSelection();
        calculateTotalPayableAndUpdateView();  // Calculate total payable after adding items
    }

    @FXML
    private void checkOutAndShowBillButtonOnClick(ActionEvent event) {

        String name = NameTextFeild.getText().trim();

        if (!isValidName(name)) {
            showAlert("Error", "Invalid name. Please enter a valid name without numeric characters.");
            return;
        }

        if (NameTextFeild.getText().trim().isEmpty() ||
                    CityComboBox.getValue() == null ||
                    dueDate.getValue() == null ||
                    contactTextFeild.getText().trim().isEmpty()) {
                    showAlert("Error", "Please fill in all the required fields before generating the invoice.");
                    return;
                }

        invoiceCounter = Invoices.findHighestInvoiceNumber(totalPayableTextField, invoiceCounter);

         if (InvoiceList.isEmpty()) {
        showAlert("Error", "Please add items to the invoice before checking out.");
        return;
    }

    StringBuilder billDetails = new StringBuilder();
    billDetails.append("Invoice Number: ").append(invoiceCounter).append("\n");
    billDetails.append("Name: ").append(NameTextFeild.getText()).append("\n");
    billDetails.append("City: ").append(CityComboBox.getValue()).append("\n");
    billDetails.append("Due Date: ").append(dueDate.getValue()).append("\n");
    billDetails.append("Contact: ").append(contactTextFeild.getText()).append("\n");
    billDetails.append("\n");
    billDetails.append("Item Details:").append("\n");
    billDetails.append("--------------------------").append("\n");

    float totalPayable = 0.0f;
    for (Invoices invoice : InvoiceList) {
        float rate = invoice.getRate();
        int quantity = invoice.getQuantity();
        float vatRate = invoice.getVatRate();
        float vatAmount = (rate * quantity * vatRate) / 100;
        float grossTotal = (rate * quantity) + vatAmount;
        totalPayable += grossTotal;

        billDetails.append("Product: ").append(invoice.getProductName()).append(", ");
        billDetails.append("Rate: ").append(rate).append(", ");
        billDetails.append("Quantity: ").append(quantity).append(", ");
        billDetails.append("VAT Rate: ").append(vatRate).append("%, ");
        billDetails.append("VAT Amount: ").append(vatAmount).append(", ");
        billDetails.append("Gross Total: ").append(grossTotal).append("\n");
    }

    billDetails.append("\n");
    billDetails.append("Total Payable: ").append(totalPayable);

    personalDetailsTextArea.setText(billDetails.toString());
        
        clearFields();
        tableVIew.getItems().clear();
        vatTextField.clear();
        rateTextFeild.clear();
    }

    @FXML
    private void addClientOnClick(ActionEvent event) {
        String name = NameTextFeild.getText().trim();
        String city = CityComboBox.getValue();
        LocalDate selectedDate = dueDate.getValue();
        String contact = contactTextFeild.getText().trim();

        if (name.isEmpty() || city == null || selectedDate == null || contact.isEmpty()) {
            showAlert("Error", "Please fill in all the required fields.");
            return;
        }

        if (!isValidName(name)) {
            showAlert("Error", "Invalid name. Please enter a valid name without numeric characters.");
            return;
        }

        if (!isValidContact(contact)) {
            showAlert("Error", "Invalid contact number. Please enter a valid 11-digit number starting with 01.");
            return;
        }

        // Save client details or perform any other necessary actions

        showAlert("Success", "Client details added successfully.");
    }

    private void handleProductSelection(ActionEvent event) {
        Invoices.handleProductSelection(selectProductComboBox, rateTextFeild, vatTextField, predefinedPrices, predefinedVat);
    }

    private void calculateTotalPayableAndUpdateView() {
        float totalPayable = 0.0f;
        for (Invoices invoice : InvoiceList) {
            float rate = invoice.getRate();
            int quantity = invoice.getQuantity();
            float vatRate = invoice.getVatRate();
            float vatAmount = (rate * quantity * vatRate) / 100;
            float grossTotal = (rate * quantity) + vatAmount;
            totalPayable += grossTotal;
        }
        totalPayableTextField.setText(String.format("Total Payable: %.2f BDT", totalPayable));
    }

    private boolean isValidName(String name) {
        return !name.isEmpty() && !name.matches(".*\\d.*");
    }

    private boolean isValidContact(String contact) {
        return contact.matches("^01[0-9]{9}$");
    }

    private void clearFields() {
        NameTextFeild.clear();
        CityComboBox.getSelectionModel().clearSelection();
        dueDate.setValue(null);
        contactTextFeild.clear();
        personalDetailsTextArea.clear();
        InvoiceList.clear();
        totalPayableTextField.setText("");
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void detailsOnClick(ActionEvent event) {
        try {
            FXMLLoader termsLoader = new FXMLLoader(getClass().getResource("User_03_Goal_01_Details.fxml"));
            Parent termsRoot = termsLoader.load();
            Stage termsStage = new Stage();
            termsStage.setTitle("Details of GENERATE INVOICES GOAL");
            termsStage.setScene(new Scene(termsRoot));
            termsStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void goBackOnCLick(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Home.fxml"));
            Parent root = loader.load();
            Scene scene = new Scene(root);
            Stage currentStage = (Stage) BACK.getScene().getWindow();
            currentStage.setScene(scene);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

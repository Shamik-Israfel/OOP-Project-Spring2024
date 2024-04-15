package Supplier;

import java.io.File;
import java.io.FilenameFilter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Invoices {

    private String name;
    private String city;
    private LocalDate dueDate;
    private int contact;
    private String productName;
    private float rate;
    private float vatRate;
    private int quantity;

    public Invoices(String productName, float rate, float vatRate, int quantity) {
        this.productName = productName;
        this.rate = rate;
        this.vatRate = vatRate;
        this.quantity = quantity;
    }

    public float getGrossTotal() {
        float vatAmount = (rate * quantity * vatRate) / 100;
        return (rate * quantity) + vatAmount;
    }

    public String getProductName() {
        return productName;
    }

    public float getVatRate() {
        return vatRate;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getRate() {
        return rate;
    }

    public static void handleProductSelection(ComboBox<String> selectProductComboBox, TextField rateTextFeild, TextField vatTextField, float[] predefinedPrices, int[] predefinedVat) {
        String selectedProduct = selectProductComboBox.getValue();
        if (selectedProduct != null) {
            int index = selectProductComboBox.getItems().indexOf(selectedProduct);
            if (index >= 0 && index < predefinedPrices.length && index < predefinedVat.length) {
                float rate = predefinedPrices[index];
                int vatPercentage = predefinedVat[index];

                rateTextFeild.setText("Rate: " + rate);
                vatTextField.setText(vatPercentage + "%");
            }
        }
    }

    public static int findHighestInvoiceNumber(Label totalPayableTextField, int invoiceCounter) {
        String invoiceFolderPath = "I:/.shortcut-targets-by-id/1-5XpgZLlKuPq1oQh87JMzwmlJUVInsPA/FXML Explorers Group Project/IUB Immigration Consulting Firm_2/IUB Immigration Consulting Firm/src/ClientInvoices_GeneratedByAccountant/";
        File invoiceFolder = new File(invoiceFolderPath);

        if (!invoiceFolder.exists()) {
            invoiceFolder.mkdirs();
        } else {
            File[] invoiceFiles = invoiceFolder.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.matches("Invoice\\d+\\.txt");
                }
            });

            int highestNumber = 0;
            if (invoiceFiles != null && invoiceFiles.length > 0) {
                Pattern pattern = Pattern.compile("Invoice(\\d+)\\.txt");
                for (File file : invoiceFiles) {
                    Matcher matcher = pattern.matcher(file.getName());
                    if (matcher.find()) {
                        int number = Integer.parseInt(matcher.group(1));
                        highestNumber = Math.max(highestNumber, number);
                    }
                }
                invoiceCounter = highestNumber + 1;
            }
        }

        totalPayableTextField.setText("Total Payable: 0.0 BDT");

        return invoiceCounter;
    }

    public static void addToTable(ComboBox<String> selectProductComboBox, ComboBox<Integer> quantityComboBox,
            float[] predefinedPrices, int[] predefinedVat, ArrayList<Invoices> invoiceList, boolean clientDataEntered,
            TextField rateTextFeild, TextField vatTextField) {
        String selectedProduct = selectProductComboBox.getValue();
        if (selectedProduct != null) {
            int index = selectProductComboBox.getItems().indexOf(selectedProduct);
            if (index >= 0 && index < predefinedPrices.length && index < predefinedVat.length) {
                String productName = selectedProduct;
                float rate = predefinedPrices[index];
                float vatRate = predefinedVat[index];
                int quantity = quantityComboBox.getValue();

                Invoices invoice = new Invoices(productName, rate, vatRate, quantity);
                invoiceList.add(invoice);

                if (!clientDataEntered) {
                    rateTextFeild.setText("Rate: " + rate);
                    vatTextField.setText(vatRate + "%");
                }
            }
        }
    }

    public static void calculateTotalPayableAndUpdateView(ArrayList<Invoices> invoiceList, Label totalPayableTextField,
            TableView<Invoices> tableView, TableColumn<Invoices, Float> totalPayableCol) {
        tableView.getItems().setAll(invoiceList);
        float totalPayable = 0.0f;

        for (Invoices invoice : invoiceList) {
            totalPayable += invoice.getGrossTotal();
        }

        totalPayableTextField.setText("Total Payable: " + totalPayable + " BDT");
        tableView.refresh();
    }
}

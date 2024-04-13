/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Shamik_Mondal_2221145;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Text;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Optional;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.FileChooser;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import Shamik_Mondal_2221145.GeneratePDFModelClass;


/**
 *
 * @author hp
 */
public class GeneratePDFModelClass {

    private static String titleText;
     public static void generatePdf(ObservableList<Employee> employees, String text) {
        try {
            FileChooser fc = new FileChooser();
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("PDF files", "*.pdf"));
            fc.getExtensionFilters().add(new FileChooser.ExtensionFilter("Image files", "*.jpg", "*.bmp", "*.png"));
            File f = fc.showSaveDialog(null);
            if (f != null) {
                PdfWriter pw = new PdfWriter(new FileOutputStream(f));
                PdfDocument pdf = new PdfDocument(pw);
                pdf.addNewPage();
                Document doc = new Document(pdf);
                doc.setLeftMargin(70);

//adding paragrapg to the pdf
                Text Title = new Text(titleText);

                Paragraph pageTitle = new Paragraph(titleText);
                pageTitle.setBold();
                doc.add(pageTitle);
                Paragraph textParagraph = new Paragraph(text);
                doc.add(textParagraph);

                /*
//adding table to the pdf
                for (PropertyListing property : propertyList) {
                Paragraph propertyParagraph = new Paragraph(property.toString());
                doc.add(propertyParagraph);
                }
                 */
//adding an image
                Alert a = new Alert(Alert.AlertType.CONFIRMATION);
                a.setContentText("Do you want to add an Image?");
                Optional<ButtonType> result = a.showAndWait();
                if (result.get() == ButtonType.OK) {
                    File imageFile = fc.showOpenDialog(null);
                    String imagePath = imageFile.getAbsolutePath();
                    ImageData data = ImageDataFactory.create(imagePath);
                    Image image = new Image(data);
                    image.setAutoScale(true);

                    doc.add(image);

                    String text2 = ("The image is added successfully.");
                    GenerateAlerts.successfulAlert(text2);
                }
                doc.close();

                String text1 = ("The PDF is saved successfully.");
                GenerateAlerts.successfulAlert(text1);
            } else {
                String text5 = "Saving as PDF: cancelled!";
                GenerateAlerts.unsuccessfulAlert(text5);
            }
        } catch (Exception e) {
            String text6 = "Oops! Exception: " + e.toString() + " occured.";
            GenerateAlerts.unsuccessfulAlert(text6);
        }
    }

   



}


   
    


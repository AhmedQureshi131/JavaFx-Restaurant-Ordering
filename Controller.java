package sample;

import java.io.*;
import java.net.URL;
import java.util.*;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Controller implements Initializable {
    @FXML
    private ImageView ivPizza;
    @FXML
    private Label lbitems;
    @FXML
    private RadioButton rbWings;
    @FXML
    private RadioButton rbPizza;
    @FXML
    private RadioButton rbFried;
    @FXML
    private Label lbSize;
    @FXML
    private ChoiceBox<String> cbSize;
    private final String[] sizeItems = {"Small", "Medium", "Large"};
    private final ObservableList<String> sizeList = FXCollections.observableArrayList(sizeItems);
    @FXML
    private Label lblQuantity;
    @FXML
    private TextField tfQuantity;
    @FXML
    private Button btnOrder;
    @FXML
    private Button btnReset;
    @FXML
    private TextArea taSummary;
    @FXML
    private RadioButton rbDailySpecial;
    @FXML
    private TextField tfDailySpecial;


    @Override
    public void initialize(URL url, ResourceBundle rb){
     cbSize.setItems(sizeList);

    }






    @FXML
    private void handleOrderButtonAction(ActionEvent event) {

        Cafe cafe = new Cafe();
        if (rbWings.isSelected()) {
            cafe.setType("Small"); //1 for wings, 2 for pizza, 3 for fried
            cafe.setSize(cbSize.getSelectionModel().getSelectedIndex()); //0 for small, 1 for medium, 2 for large
            cafe.setPrice(5.00);
            cafe.setQuantity(Integer.parseInt(tfQuantity.getText()));

            taSummary.appendText(rbWings.getText() + " " + cafe.getType() + " Total Price  $" + cafe.getPrice() * cafe.getQuantity() + " Quantity is " + cafe.getQuantity() + "\n");

        } else if (rbPizza.isSelected()) {
            cafe.setType("Medium");
            cafe.setSize(cbSize.getSelectionModel().getSelectedIndex());
            cafe.setPrice(3.00);
            cafe.setQuantity(Integer.parseInt(tfQuantity.getText()));
            taSummary.appendText(rbPizza.getText() + " " + cafe.getType() + " Total Price $" + cafe.getPrice() * cafe.getQuantity() + " Quantity is " + cafe.getQuantity() + "\n");

        } else if (rbFried.isSelected()) {
            cafe.setType("Large");
            cafe.setSize(cbSize.getSelectionModel().getSelectedIndex());
            cafe.setPrice(4.59);
            cafe.setQuantity(Integer.parseInt(tfQuantity.getText()));
            taSummary.appendText(rbFried.getText() + " " + cafe.getType() + " Total Price $" + cafe.getPrice() * cafe.getQuantity() + " Quantity is " + cafe.getQuantity() + "\n");

        }
        else   if(rbDailySpecial.isSelected()){
            cafe.setType("Daily Special");
           cafe.setPrice(6.50);
            cafe.setDailyQuantity(Integer.parseInt(tfDailySpecial.getText()));

            taSummary.appendText(rbDailySpecial.getText()  + " "+" Total Price $" + cafe.getPrice() *  cafe.getDailyQuantity()+ " Quantity is " + cafe.getDailyQuantity() + "\n");
    }else {
            taSummary.appendText("Please select your order!! " + "\n");
        }

    }
    @FXML
    private void handleResetButtonAction(ActionEvent event){
          rbWings.setSelected(false);
        rbPizza.setSelected(false);
        rbFried.setSelected(false);
        tfQuantity.setText(null);
        rbDailySpecial.setSelected(false);
        tfDailySpecial.setText(null);
        cbSize.setValue(null);



    }


}

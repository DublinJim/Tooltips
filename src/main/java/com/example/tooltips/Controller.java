package com.example.tooltips;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public AnchorPane rootPane;
    public HBox mainHbox;
    public ComboBox <String> choiceBox1;

    public CheckBox  chkBox1;
    public Button btn1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        Tooltip chkTip = new Tooltip("This is the explanation of what this does.\n More stuff on a new line");

chkBox1.setTooltip(chkTip);

    }//init end


}//end

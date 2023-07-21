package com.example.tooltips;

import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Popup;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public AnchorPane rootPane;
    public HBox mainHbox;
    public ComboBox<String> choiceBox1;

    public CheckBox chkBox1;
    public Button btn1;
    public Label lbl1;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //the pop up
        Popup popup = new Popup();
        Label popLbl = new Label("Information on stuff right here");
        popup.getContent().add(popLbl);
        popup.setAutoHide(true);


//........................
        Tooltip chkTip = new Tooltip("This is the explanation of what this does.\n More stuff on a new line");

        chkTip.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");


        lbl1.setTooltip(chkTip);
        lbl1.setOnMouseClicked(mouseEvent -> {

            StackPane secondRoot = new StackPane();
            Scene secondScene = new Scene(secondRoot, 250, 150);
            Stage popstage = new Stage();
            popstage.setScene(secondScene);
            popstage.show();

        });
        chkTip.setShowDelay(javafx.util.Duration.millis(100));

    }//init end


}//end

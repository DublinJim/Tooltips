package com.example.tooltips;

import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public AnchorPane rootPane;
    public HBox mainHbox;
    public ComboBox<String> choiceBox1;

    public CheckBox chkBox1;

    public ControllerPopstage controllerPopstage = new ControllerPopstage();
    public Button btnTip;
    public Label lblAlwaysOntopHelp;
    public ChoiceBox choiceBox2;
    public ImageView imgQuestiion;

    private static Tooltip getTooltip() {
        Tooltip chkTip = new Tooltip("Whats this ?\nClick for more info");
        chkTip.setStyle("-fx-font-size: 14px; -fx-font-weight: bold;");
        chkTip.setShowDelay(javafx.util.Duration.millis(100));

        return chkTip;
    }

    private static void alertDisplay() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Warning Dialog");
        alert.setHeaderText(null);
        alert.setContentText("This is information that may be required to explain the node");
        alert.initStyle(StageStyle.UNDECORATED);
        alert.initStyle(StageStyle.UTILITY);
        alert.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        choiceBox2.setValue("Squelch Volume");
        Image image = new Image(getClass().getResourceAsStream("rawBtn.png"));

        imgQuestiion.setImage(image);
        imgQuestiion.setPreserveRatio(true);
        Tooltip chkTip = getTooltip();

        lblAlwaysOntopHelp.setText("");
        lblAlwaysOntopHelp.setTooltip(chkTip);
        lblAlwaysOntopHelp.setGraphic(imgQuestiion);
        lblAlwaysOntopHelp.setOnMouseClicked(mouseEvent -> alertDisplay());

        btnTip.setOnMouseClicked(mouseEvent -> {
            try {
                controllerPopstage.showStageEnableAlwaysOnTop();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });


        btnTip.setTooltip(chkTip);

    }//init end
}//end

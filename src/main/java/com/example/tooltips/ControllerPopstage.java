package com.example.tooltips;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControllerPopstage implements Initializable {
    public Text txtInfo;
    public Button popBtn;
    public AnchorPane rootPanePOP;

    public String infoToDisplay;
    public String fxmlFileName;
    private Stage cancelStage = new Stage();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        popBtn.setStyle(
                "-fx-background-radius: 5em; " +
                        "-fx-min-width: 15px; " +
                        "-fx-min-height: 15px; " +
                        "-fx-max-width: 15px; " +
                        "-fx-max-height: 15px;"
        );
        popBtn.setText("?");
        popBtn.setOnAction(e -> closePopup());
    }


    public void showStageEnableAlwaysOnTop() throws IOException {
        fxmlFileName="popstage.fxml";



        showStage();
    }



    private void showStage() throws IOException {
        Stage popStage = new Stage(StageStyle.UNDECORATED);
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxmlFileName));
        Scene scene = new Scene(fxmlLoader.load());
        popStage.setScene(scene);
        popStage.show();
        cancelStage = popStage;
    }

    private void closePopup() {
        Scene currentScene = popBtn.getScene();
        cancelStage = (Stage) currentScene.getWindow();
        cancelStage.close();
    }

}

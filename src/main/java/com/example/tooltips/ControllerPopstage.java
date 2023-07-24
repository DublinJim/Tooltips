package com.example.tooltips;

import javafx.application.Platform;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerPopstage implements Initializable {
    public AnchorPane rootPane;
    public Text txtInfo;
    public Button popBtn;
    private String infoToDisplay;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        infoToDisplay = "In this example, we create a custom alert by creating" + " a new Stage and populating it with a VBox containing a label and" + " an OK button. We set the background color of the VBox using CSS" + " with the -fx-background-color property. T" + "he custom alert is displayed with a light blue (" + "#e0f0ff) background color.Keep in mind that customizing the appearance" + " of an alert this way might not provide the same consistent look and feel as the standard " + "system alert. Customizing alerts may be useful when you want a specific design or have " + "unique requirements, but it may not fully match the native look and behavior of standard alerts.";
        txtInfo.setText(infoToDisplay);

        popBtn.setOnAction(actionEvent -> Platform.exit());
    }



}

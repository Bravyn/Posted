package com.example.posted;
import javafx.application.Application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.paint.Paint;
import com.example.posted.HelloApplication;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField productSearch;


    @FXML
    protected void onProductSearchButtonClick() throws IOException {
        HelloApplication app = new HelloApplication();
        Stage stage = new Stage();
        app.screenTwo(stage);
    }
}

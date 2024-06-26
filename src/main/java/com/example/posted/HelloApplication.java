package com.example.posted;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;



public class HelloApplication extends Application {
    public boolean switched = false;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("POSTED!");
        stage.setFullScreen(true);

        stage.setScene(scene);
        if (!this.switched){stage.show();}
    }
    public void screenTwo(Stage stage) throws IOException{
        FXMLLoader floader = new FXMLLoader(HelloApplication.class.getResource("home-view.fxml"));
        Scene scene2 = new Scene(floader.load(), 320, 240);
        stage.setTitle("Home");
        stage.setScene(scene2);
        this.switched = true;
        stage.show();
    }



    public static void main(String[] args) {
        launch();
    }
}
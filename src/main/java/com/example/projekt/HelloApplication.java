package com.example.projekt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
       // scene.getStylesheets().add(
          //      this.getClass().getResource("application.css").toExternalForm());
        Label a= new Label("password:");
        GridPane.setConstraints(a,0,1);
        stage.setTitle("client");
        stage.setScene(scene);
        stage.show();

    }
    public static class dodawanie{
        public int dodaj(int a, int b){
            return a+b;
        }
    }
    public static void main(String[] args) {
        launch();
    }
}
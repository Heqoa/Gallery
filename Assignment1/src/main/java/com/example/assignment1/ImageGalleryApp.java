package com.example.assignment1;



import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class ImageGalleryApp extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/assignment1/ImageGallery.fxml"));

        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.setTitle("Image Gallery");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

package com.example.assignment1;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class ImageGalleryController {

    @FXML
    private GridPane gridPane;

    private final Image[] images;

    public ImageGalleryController() {
        images = new Image[]{
                new Image(getClass().getResource("/com/example/assignment1/assignment1/arr.png").toExternalForm()),
                new Image(getClass().getResource("/com/example/assignment1/assignment1/autumn.jpg").toExternalForm()),
                new Image(getClass().getResource("/com/example/assignment1/assignment1/matera.jpg").toExternalForm()),
                new Image(getClass().getResource("/com/example/assignment1/assignment1/swirl.jpg").toExternalForm())
        };
    }

    @FXML
    public void initialize() {
        for (int i = 0; i < images.length; i++) {
            ImageView thumbnail = new ImageView(images[i]);
            thumbnail.setFitWidth(150);
            thumbnail.setFitHeight(150);
            int finalI = i; // Needs to be effectively final for lambda expression
            thumbnail.setOnMouseClicked(event -> showFullSizeImage(images[finalI]));
            gridPane.add(thumbnail, i % 3, i / 3);
        }
    }

    private void showFullSizeImage(Image image) {
        // Implement logic to show full-size image
    }
}

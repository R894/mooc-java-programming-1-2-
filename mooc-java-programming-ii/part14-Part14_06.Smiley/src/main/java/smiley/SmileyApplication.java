package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class SmileyApplication extends Application {


    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Canvas paintingCanvas = new Canvas(640, 480);
        GraphicsContext painter = paintingCanvas.getGraphicsContext2D();

        ColorPicker colorPalette = new ColorPicker();

        BorderPane paintingLayout = new BorderPane();
        paintingLayout.setCenter(paintingCanvas);
        paintingLayout.setRight(colorPalette);
        
        painter.setFill(Color.BLACK);
        painter.fillRect(30, 30, 30, 30);
        painter.fillRect(120, 30, 30, 30);
        painter.fillRect(0, 120, 30, 30);
        painter.fillRect(30, 150, 30, 30);
        painter.fillRect(60, 150, 30, 30);
        painter.fillRect(90, 150, 30, 30);
        painter.fillRect(120, 150, 30, 30);
        painter.fillRect(150, 120, 30, 30);

        paintingCanvas.setOnMouseDragged((event) -> {
            double xLocation = event.getX();
            double yLocation = event.getY();
            painter.setFill(colorPalette.getValue());
            painter.fillOval(xLocation, yLocation, 4, 4);
        });

        Scene view = new Scene(paintingLayout);

        stage.setScene(view);
        stage.show();
    }

}

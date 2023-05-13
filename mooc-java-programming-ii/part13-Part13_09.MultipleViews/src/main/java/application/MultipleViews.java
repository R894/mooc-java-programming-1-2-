package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane borderPane = new BorderPane();
        Button button1 = new Button("To the second view!");
        borderPane.setCenter(button1);
        Scene first = new Scene(borderPane);
        
        borderPane.setTop(new Label("First view!"));
        
        VBox vBox = new VBox();
        Button button2 = new Button("To the third view!");
        vBox.getChildren().addAll(button2, new Label("Second view!"));
        Scene second = new  Scene(vBox);
        GridPane gridPane = new GridPane();
        gridPane.add(new Label("Third view!"), 0, 0);
        Button button3 = new Button("To the first view!");
        gridPane.add(button3, 1,1);
        Scene third = new Scene(gridPane);
        
        button1.setOnAction((event) -> {
            window.setScene(second);
        });
        button2.setOnAction((event) ->{
            window.setScene(third);
        });
        button3.setOnAction((event) ->{
            window.setScene(first);
        });
        
        window.setScene(first);
        window.show();
    }

}

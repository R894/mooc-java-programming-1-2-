package application;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application {


    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        Button startButton = new Button("Start");
        TextField textField = new TextField();
        Label instructionText = new Label("Enter name");
        
        GridPane layout = new GridPane();
        
        layout.add(instructionText, 0, 0);
        layout.add(textField, 0, 1);
        layout.add(startButton, 0,2);
        Scene scene1 = new Scene(layout);
        
        BorderPane borderPane = new BorderPane();
        Label welcomeLabel = new Label();
        borderPane.setCenter(welcomeLabel);
        Scene scene2 = new Scene(borderPane);
        
        startButton.setOnAction((event) -> {
            welcomeLabel.setText("Welcome "+textField.getText()+"!");
            window.setScene(scene2);
        });
        
        window.setScene(scene1);
        window.show();
    }
}

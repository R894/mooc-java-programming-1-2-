package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class NotifierApplication extends Application {


    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        VBox vBox = new VBox();
        TextField textField = new TextField();
        Label label = new Label();
        Button button = new Button("Update");
        
        button.setOnAction((event) ->{
            label.setText(textField.getText());
        });
        
        vBox.getChildren().addAll(textField, button, label);
        
        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.setTitle("Notifier Application");
        window.show();
    }

}

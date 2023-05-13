package buttonandtextfield;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class ButtonAndTextFieldApplication extends Application {


    public static void main(String[] args) {
        launch(ButtonAndTextFieldApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        TextField textField = new TextField();
        Button button = new Button("A button");
        
        FlowPane flowPane = new FlowPane();
        
        flowPane.getChildren().add(button);
        flowPane.getChildren().add(textField);
        
        Scene view = new Scene(flowPane);
        
        window.setScene(view);
        window.show();
    }
    
}

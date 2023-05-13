package textstatistics;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class TextStatisticsApplication extends Application {

    
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        BorderPane borderPane = new BorderPane();
        
        borderPane.setCenter(new TextArea());
        HBox hBox = new HBox();
        hBox.getChildren().add(new Label("Letters: 0"));
        hBox.getChildren().add(new Label("Words: 0"));
        hBox.getChildren().add(new Label("The longest word is:"));
        
        borderPane.setBottom(hBox);
        Scene scene = new Scene(borderPane);
        
        window.setScene(scene);
        window.show();
    }

}

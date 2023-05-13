package textstatistics;

import java.util.Arrays;
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
        TextArea textArea = new TextArea();
        borderPane.setCenter(textArea);
        
        HBox hBox = new HBox();
        
        Label lettersLabel = new Label("Letters: 0");
        Label wordsLabel = new Label("Words: 0");
        Label longestWordLabel = new Label("The longest word is: ");
        
        hBox.getChildren().add(lettersLabel);
        hBox.getChildren().add(wordsLabel);
        hBox.getChildren().add(longestWordLabel);
        
        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            int characters = newValue.length();
            String[] parts = newValue.split(" ");
            int words = parts.length;
            String longest = Arrays.stream(parts)
                .sorted((s1, s2) -> s2.length() - s1.length())
                .findFirst()
                .get();

        lettersLabel.setText("Letters: "+characters);
        wordsLabel.setText("Words: "+words);
        longestWordLabel.setText("The longest word is: "+longest);
    });
        
        hBox.setSpacing(5);
        borderPane.setBottom(hBox);
        Scene scene = new Scene(borderPane);
        
        window.setScene(scene);
        window.show();
    }

}

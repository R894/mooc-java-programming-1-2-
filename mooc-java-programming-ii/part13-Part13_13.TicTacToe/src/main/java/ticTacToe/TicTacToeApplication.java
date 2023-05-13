package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class TicTacToeApplication extends Application {


    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

    @Override
    public void start(Stage window) throws Exception {
        MainView mainView = new MainView();
        
        Scene view = new Scene(mainView.getView());
        window.setScene(view);
        window.show();
    }

}

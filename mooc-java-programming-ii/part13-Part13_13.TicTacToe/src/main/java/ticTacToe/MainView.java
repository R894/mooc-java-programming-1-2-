/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ticTacToe;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

/**
 *
 * @author Limi
 */
public class MainView {
    
    public Parent getView(){
        BorderPane borderPane = new BorderPane();
        GridPane layout = new GridPane();
        
        Button[][] btns = new Button[3][3];
        Label currentTurn = new Label("Turn: X");
        TicTacToe tic = new TicTacToe(btns);
        
        for(int i=0; i<btns.length; i++){
            for(int j =0; j < btns[0].length; j++){
                btns[i][j] = new Button(" ");
                btns[i][j].setFont(Font.font("Monospaced", 40));
                
                final int ii = i;
                final int jj = j;
                
                btns[i][j].setOnMouseClicked((event) -> {
                    tic.mark(btns[ii][jj]);
                    currentTurn.setText("Turn: "+tic.getCurrentTurn());
                    
                    String win =tic.checkWin(btns);
                    if(win != null){
                        disableButtons(btns);
                        currentTurn.setText("The end!");
                    }
                });
                
                layout.add(btns[i][j], j, i);
            }
        }
        
        borderPane.setTop(currentTurn);
        borderPane.setCenter(layout);
        return borderPane;
    }
    private void disableButtons(Button[][] btns){
        for(int i=0; i<btns.length; i++){
            for(int j=0; j<btns.length; j++){
                btns[i][j].setDisable(true);
            }
        }
    }
}

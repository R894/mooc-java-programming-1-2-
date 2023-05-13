package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        NumberAxis xAxis = new NumberAxis(2006, 2018, 1);
        NumberAxis yAxis = new NumberAxis();
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        
        lineChart.setTitle("University of Helsinki, Shanghai ranking");
        
        XYChart.Series rkpData = new XYChart.Series();
        rkpData.setName("RKP");
        
        rkpData.getData().add(new XYChart.Data(2007, 73));
        rkpData.getData().add(new XYChart.Data(2008, 68));
        rkpData.getData().add(new XYChart.Data(2009, 72));
        rkpData.getData().add(new XYChart.Data(2010, 72));
        rkpData.getData().add(new XYChart.Data(2011, 74));
        rkpData.getData().add(new XYChart.Data(2012, 73));
        rkpData.getData().add(new XYChart.Data(2013, 76));
        rkpData.getData().add(new XYChart.Data(2014, 73));
        rkpData.getData().add(new XYChart.Data(2015, 67));
        rkpData.getData().add(new XYChart.Data(2016, 56));
        rkpData.getData().add(new XYChart.Data(2017, 56));
        
        // add the data set to the line chart
        lineChart.getData().add(rkpData);

        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
        
    }

}

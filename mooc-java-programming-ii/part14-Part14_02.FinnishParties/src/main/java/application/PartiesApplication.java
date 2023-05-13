package application;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }
    
    private Map readData() throws Exception{
        File file = new File("partiesdata.tsv");
        Scanner scanner = new Scanner(file);
        Map<String, Map<Integer, Double>> values = new HashMap<>();
        
        while(scanner.hasNextLine()){
            String[] parts = scanner.nextLine().split("\t");
            
            String string = parts[0];
            if(string.equals("Party")){
                continue;
            }
            Map<Integer, Double> data = new HashMap<>();
            int year = 1968;
            for(int i=1; i<parts.length; i++){
                try{
                    data.put(year, Double.valueOf(parts[i]));
                    System.out.println(Double.valueOf(parts[i]));
                    year+= 4;
                }catch(Exception e){
                    year+= 4;
                    continue;
                }
            }
            values.put(string, data);
        }
        return values;
    }
    
    @Override
    public void start(Stage stage) throws Exception {
        
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis();
        
        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%)");
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support in the years 1968-2008");
        
        
        
        Map<String, Map<Integer, Double>> values = readData();
        
        values.keySet().stream().forEach(party -> {
            // a different data set for every party
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            // add the party's support numbers to the data set
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            // and add the data set to the chart
            lineChart.getData().add(data);
        });
        
        
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    
    }

}

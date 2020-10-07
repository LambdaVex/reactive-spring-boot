package com.adenno.stockui;

import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import org.springframework.stereotype.Component;

@Component
public class ChartController {
    @FXML
    public LineChart<String, Double> chart;
}

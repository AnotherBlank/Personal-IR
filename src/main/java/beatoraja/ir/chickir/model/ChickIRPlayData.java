package beatoraja.ir.chickir.model;

import bms.player.beatoraja.MainController;
import bms.player.beatoraja.ir.IRChartData;
import bms.player.beatoraja.ir.IRScoreData;

public class ChickIRPlayData {
    private String player;
    private IRChartData chartData;
    private IRScoreData scoreData;
    private String client;

    public ChickIRPlayData(IRChartData chartData, IRScoreData scoreData) {
        this.chartData = chartData;
        this.scoreData = scoreData;
        this.client = MainController.getVersion();
        this.player = scoreData.player;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public IRChartData getChartData() {
        return chartData;
    }

    public void setChartData(IRChartData chartData) {
        this.chartData = chartData;
    }

    public IRScoreData getScoreData() {
        return scoreData;
    }

    public void setScoreData(IRScoreData scoreData) {
        this.scoreData = scoreData;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}

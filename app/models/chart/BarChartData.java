package models.chart;

import java.util.List;

/**
 * <p>Класс данных для построения графиков Bar Chart</p>
 *
 * @author Dmitriy Grigoriev
 */
public class BarChartData {
  private List<String> labels;
  private String fillColor;
  private String strokeColor;
  private String highlightFill;
  private String highlightStroke;
  private List<Integer> data;

  public BarChartData(List<Integer> data) {
    setDefault(data);
  }

  public BarChartData (List<String> labels, List<Integer> data) {
    this.labels = labels;
    setDefault(data);
  }

  public BarChartData (List<String> labels, String fillColor, String strokeColor, String highlightFill,
                      String highlightStroke, List<Integer> data)
  {
    this.labels = labels;
    this.fillColor = fillColor;
    this.strokeColor = strokeColor;
    this.highlightFill = highlightFill;
    this.highlightStroke = highlightStroke;
    this.data = data;
  }

  private void setDefault(List<Integer> data) {
    this.data = data;
    this.fillColor = "rgba(151,187,205,0.5)";
    this.strokeColor = "rgba(151,187,205,0.8)";
    this.highlightFill = "rgba(151,187,205,0.75)";
    this.highlightStroke = "rgba(151,187,205,1)";
  }

  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }

    public String getFillColor() {
    return fillColor;
  }

  public void setFillColor(String fillColor) {
    this.fillColor = fillColor;
  }

  public String getStrokeColor() {
    return strokeColor;
  }

  public void setStrokeColor(String strokeColor) {
    this.strokeColor = strokeColor;
  }

  public String getHighlightFill() {
    return highlightFill;
  }

  public void setHighlightFill(String highlightFill) {
    this.highlightFill = highlightFill;
  }

  public String getHighlightStroke() {
    return highlightStroke;
  }

  public void setHighlightStroke(String highlightStroke) {
    this.highlightStroke = highlightStroke;
  }

  public List<Integer> getData() {
    return data;
  }

  public void setData(List<Integer> data) {
    this.data = data;
  }
}

package models.chart;

import java.util.List;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class LineChartData {
  private String label;
  private String fillColor;
  private String strokeColor;
  private String pointColor;
  private String pointStrokeColor;
  private String pointHighlightFill;
  private String pointHighlightStroke;
  private List<Integer> data;
  private List<String> labels;

  public LineChartData(String label, String fillColor, String strokeColor, String pointColor,
                       String pointStrokeColor, String pointHighlightFill, String pointHighlightStroke,
                       List<Integer> data, List<String> labels)
  {
    this.label = label;
    this.fillColor = fillColor;
    this.strokeColor = strokeColor;
    this.pointColor = pointColor;
    this.pointStrokeColor = pointStrokeColor;
    this.pointHighlightFill = pointHighlightFill;
    this.pointHighlightStroke = pointHighlightStroke;
    this.data = data;
    this.labels = labels;
  }

  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
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

  public String getPointColor() {
    return pointColor;
  }

  public void setPointColor(String pointColor) {
    this.pointColor = pointColor;
  }

  public String getPointStrokeColor() {
    return pointStrokeColor;
  }

  public void setPointStrokeColor(String pointStrokeColor) {
    this.pointStrokeColor = pointStrokeColor;
  }

  public String getPointHighlightFill() {
    return pointHighlightFill;
  }

  public void setPointHighlightFill(String pointHighlightFill) {
    this.pointHighlightFill = pointHighlightFill;
  }

  public String getPointHighlightStroke() {
    return pointHighlightStroke;
  }

  public void setPointHighlightStroke(String pointHighlightStroke) {
    this.pointHighlightStroke = pointHighlightStroke;
  }

  public List<Integer> getData() {
    return data;
  }

  public void setData(List<Integer> data) {
    this.data = data;
  }

  public List<String> getLabels() {
    return labels;
  }

  public void setLabels(List<String> labels) {
    this.labels = labels;
  }
}

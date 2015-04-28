package controllers;

import models.chart.CircleChartData;
import models.Deal;
import models.DealPhase;
import play.mvc.Controller;
import play.mvc.Result;
import utils.Color;
import views.html.graphic.graph;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class Graphs extends Controller {

  public static Result graph() {
    List<CircleChartData> chart = new ArrayList<>();
    int i = 0;
    for (DealPhase dealPhase : DealPhase.findAll()) {
      String color = Color.Light.values()[i].hex();
      String highlight = Color.Normal.values()[i].hex();
      chart.add(new CircleChartData(Deal.countDealsByPhase(dealPhase.getId()), color, highlight, dealPhase.getName()));
      i++;
    }
    return ok(graph.render(chart));
  }
}

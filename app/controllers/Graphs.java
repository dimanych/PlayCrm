package controllers;

import models.ChartData;
import models.Deal;
import models.DealPhase;
import play.mvc.Controller;
import play.mvc.Result;
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
    List<ChartData> chart = new ArrayList<>();
    int i = 1;
    for (DealPhase dealPhase : DealPhase.findAll()) {
      String color = "#" + i + "cb85c";
      String highlight = "#" + i + "0b85c";
      chart.add(new ChartData(Deal.countDealsByPhase(dealPhase.getId()), color, highlight, dealPhase.getName()));
      i++;
    }
    return ok(graph.render(chart));
  }
}

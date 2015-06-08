package controllers;

import analytics.DealGraph;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.graphic.graph;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class Graphs extends Controller {

  public static Result graph() {
    return ok(graph.render(DealGraph.chartDeals(), DealGraph.salesFunnel()));
  }
}

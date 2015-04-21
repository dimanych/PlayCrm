package controllers;

import models.Deal;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.graph.graph;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class Graphs extends Controller {
  public static Result graph() {
    return ok(graph.render(Deal.getStatistic()));
  }
}

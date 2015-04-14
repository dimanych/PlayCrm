package controllers;

import models.Contractor;
import models.Deal;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.model.deal.deals;

import java.util.List;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class Deals extends Controller {

  public static Result deals() {
    return ok(deals.render(Deal.findAll()));
  }

  public static List<Deal> dealsByContractor(Contractor contractor) {
    return Deal.findByContractor(contractor);
  }

}

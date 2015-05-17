package controllers;

import models.Contractor;
import models.Deal;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.model.deal.createDeal;
import views.html.model.deal.deal;
import views.html.model.deal.deals;

import java.util.List;

import static play.data.Form.form;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class Deals extends Controller {

  public static final Result GO_DEALS = redirect(controllers.routes.Deals.deals());

  public static Result add() {
    Form<Deal> dealForm = form(Deal.class);
    return ok(createDeal.render(dealForm));
  }

  public static Result save() {
    Form<Deal> dealForm = form(Deal.class).bindFromRequest();
    if (dealForm.hasErrors()) {
      return badRequest(deals.render(Deal.findAll()));
    }
    dealForm.get().save();
    return GO_DEALS;
  }

  public static Result update(Long id) {
    Form<Deal> dealForm = form(Deal.class).bindFromRequest();
    if (dealForm.hasErrors()) {
      throw new RuntimeException(dealForm.toString());
    }
    dealForm.get().update(id);
    return GO_DEALS;
  }

  public static Result delete(Long id) {
    Deal.findById(id).delete();
    return GO_DEALS;
  }
  
  public static Result deals() {
    return ok(deals.render(Deal.findAll()));
  }

  public static Result deal(Long id) {
    Form<Deal> dealForm = form(Deal.class).bindFromRequest();
    return ok(deal.render(Deal.findById(id), dealForm));
  }

  public static List<Deal> dealsByContractor(Contractor contractor) {
    return Deal.findByContractor(contractor);
  }

}

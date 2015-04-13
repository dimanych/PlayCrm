package controllers;

import models.Contractor;
import models.Sale;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.model.sale.sales;

import java.util.List;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class Sales extends Controller {

  public static Result sales() {
    return ok(sales.render(Sale.findAll()));
  }

  public static List<Sale> salesByContractor(Contractor contractor) {
    return Sale.findByContractor(contractor);
  }

}

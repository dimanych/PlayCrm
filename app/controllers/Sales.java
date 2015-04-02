package controllers;

import models.Sale;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.model.sale.sales;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class Sales extends Controller {

  public static Result sales() {
    return ok(sales.render(Sale.findAll()));
  }
}

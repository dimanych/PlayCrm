package controllers;

import models.submodels.OrderProduct;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class OrdersProducts extends Controller {

  public static Result delete(Long id) {
    OrderProduct.findById(id).delete();
    return null;
  }
}

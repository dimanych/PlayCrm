package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
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
    ObjectNode result = play.libs.Json.newObject();
    result.put("id", id);
    return ok(result);
  }
}

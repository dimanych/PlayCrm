package controllers;

import com.fasterxml.jackson.databind.JsonNode;
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
    try {
      OrderProduct orderProduct = OrderProduct.findById(id);
      orderProduct.delete();
      JsonNode json = request().body().asJson();
      String name = json.findPath("name").textValue();
      ObjectNode result = play.libs.Json.newObject();
      result.put("id", id);
      result.put("name", name);
      return ok(result);
    } catch (Exception ex) {
      return badRequest(ex.getMessage());
    }
  }
}

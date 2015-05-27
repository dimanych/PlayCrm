package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import models.submodels.OrderProduct;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import static play.data.Form.form;

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

  public static Result add() {
    try {
      ObjectNode result = play.libs.Json.newObject();
      Form<OrderProduct> orderProductForm = form(OrderProduct.class).bindFromRequest();
      if (orderProductForm.hasErrors()) {
        throw new Exception("Не удалось завершить операцию =(");
      }
      orderProductForm.get().save();
      return ok(result);
    } catch (Exception ex) {
      return badRequest(ex.getMessage());
    }
  }
}

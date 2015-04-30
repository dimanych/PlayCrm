package controllers;

import models.Order;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.model.order.createOrder;
import views.html.model.order.order;
import views.html.model.order.orders;


import static play.data.Form.form;

/**
 * <p>Контроллер Заказов</p>
 *
 * @author Dmitriy Grigoriev
 */
public class Orders extends Controller {
  public static final Result GO_ORDERS = redirect(controllers.routes.Orders.orders());

  public static Result orders() {
    return ok(orders.render(Order.findAll()));
  }

  public static Result order(Long id) {
    return ok(order.render(Order.findById(id)));
  }

  public static Result add() {
    Form<Order> orderForm = form(Order.class);
    return ok(createOrder.render(orderForm));
  }

  public static Result save() {
    Form<Order> orderForm = form(Order.class).bindFromRequest();
    if (orderForm.hasErrors()) {
      return badRequest(orders.render(Order.findAll()));
    }
    orderForm.get().save();
    return GO_ORDERS;
  }
}

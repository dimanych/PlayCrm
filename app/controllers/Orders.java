package controllers;

import models.OrderEntity;
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
    return ok(orders.render(OrderEntity.findAll()));
  }

  public static Result order(Long id) {
    Form<OrderEntity> orderForm = form(OrderEntity.class);
    return ok(order.render(OrderEntity.findById(id), orderForm));
  }

  public static Result add() {
    Form<OrderEntity> orderForm = form(OrderEntity.class);
    return ok(createOrder.render(orderForm));
  }

  public static Result save() {
    Form<OrderEntity> orderForm = form(OrderEntity.class).bindFromRequest();
    if (orderForm.hasErrors()) {
      return badRequest(orders.render(OrderEntity.findAll()));
    }
    orderForm.get().save();
    return GO_ORDERS;
  }

  public static Result update(Long id) {
    Form<OrderEntity> orderForm = form(OrderEntity.class).bindFromRequest();
    if (orderForm.hasErrors()) {
      throw new RuntimeException(orderForm.toString());
    }
    orderForm.get().update(id);
    return GO_ORDERS;
  }

  public static Result delete(Long id) {
    OrderEntity.findById(id).delete();
    return GO_ORDERS;
  }
}

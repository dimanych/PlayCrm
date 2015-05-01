package controllers;

import models.Booking;
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
    return ok(orders.render(Booking.findAll()));
  }

  public static Result order(Long id) {
    return ok(order.render(Booking.findById(id)));
  }

  public static Result add() {
    Form<Booking> orderForm = form(Booking.class);
    return ok(createOrder.render(orderForm));
  }

  public static Result save() {
    Form<Booking> orderForm = form(Booking.class).bindFromRequest();
    if (orderForm.hasErrors()) {
      return badRequest(orders.render(Booking.findAll()));
    }
    orderForm.get().save();
    return GO_ORDERS;
  }
}

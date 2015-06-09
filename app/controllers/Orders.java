package controllers;

import models.OrderEntity;
import models.submodels.OrderState;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import utils.Util;
import views.html.model.order.createOrder;
import views.html.model.order.editOrder;
import views.html.model.order.orders;


import java.math.BigDecimal;

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

  public static Result editOrder(Long id) {
    Form<OrderEntity> orderForm = form(OrderEntity.class);
    return ok(editOrder.render(OrderEntity.findById(id), orderForm));
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
    return ok(editOrder.render(OrderEntity.findById(orderForm.get().getId()), orderForm));
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
    SupplyPayments.deleteAll(id);
    OrdersProducts.deleteAll(id);
    OrderEntity.findById(id).delete();
    return GO_ORDERS;
  }

  /**
   * <p>Вытягивает сумму всех выставленных счетов из заказов</p>
   *
   * @return сумма всех полей с "Итого"
   */
  public static BigDecimal totalSum() {
    BigDecimal total = BigDecimal.ZERO;
    for (OrderEntity orderEntity : OrderEntity.findAll()) {
      if (orderEntity.getOrderState() != OrderState.COMPLETED || orderEntity.getOrderState() != OrderState.CANCELED) {
        total = total.add(orderEntity.getAmount());
      }
    }
    return total;
  }

  public static String totalSummf() {
    return Util.getNumberFormatted(totalSum());
  }

}

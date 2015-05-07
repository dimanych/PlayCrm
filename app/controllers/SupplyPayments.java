package controllers;

import models.OrderEntity;
import models.submodels.SupplyPayment;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.model.order.editOrder;
import views.html.model.supply_payment.sp;

import static play.data.Form.form;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class SupplyPayments extends Controller {

  public static Result sp(Long id, Long orderId) {
    Form<SupplyPayment> supplyPaymentForm = form(SupplyPayment.class);
    return ok(sp.render(SupplyPayment.findById(id), supplyPaymentForm, orderId));
  }

  public static Result delete(Long id, Long orderId) {
    SupplyPayment.findById(id).delete();
    return redirect(controllers.routes.Orders.editOrder(orderId));
  }
}

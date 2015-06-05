package controllers;

import models.submodels.SupplyPayment;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.model.supply_payment.addSp;
import views.html.model.supply_payment.sp;

import java.util.List;

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


  public static Result add(Long orderId) {
    Form<SupplyPayment> supplyPaymentForm = form(SupplyPayment.class);
    return ok(addSp.render(supplyPaymentForm, orderId));
  }


  public static Result save(Long orderId) {
    Form<SupplyPayment> supplyPaymentForm = form(SupplyPayment.class).bindFromRequest();
    if (supplyPaymentForm.hasErrors()) {
      throw new RuntimeException(supplyPaymentForm.toString());
    }
    supplyPaymentForm.get().save();
    return redirect(controllers.routes.Orders.editOrder(orderId));
  }

  public static Result delete(Long id, Long orderId) {
    SupplyPayment.findById(id).delete();
    return redirect(controllers.routes.Orders.editOrder(orderId));
  }

  public static Result deleteAll(Long orderId) {
    for (SupplyPayment sp : SupplyPayment.findList(orderId)){
      SupplyPayment.findById(sp.getId()).delete();
    }
    return redirect(controllers.routes.Orders.editOrder(orderId));
  }

  public static Result update(Long id, Long orderId) {
    Form<SupplyPayment> supplyPaymentForm = form(SupplyPayment.class).bindFromRequest();
    if (supplyPaymentForm.hasErrors()) {
      throw new RuntimeException(supplyPaymentForm.toString());
    }
    supplyPaymentForm.get().update(id);
    return ok(sp.render(SupplyPayment.findById(id), supplyPaymentForm, orderId));
  }
}

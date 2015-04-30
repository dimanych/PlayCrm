package controllers;

import models.Product;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.model.product.products;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class Products extends Controller {
  public static Result products() {
    return ok(products.render(Product.findAll()));
  }
}

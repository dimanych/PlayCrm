package controllers;

import models.Product;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.model.product.createProduct;
import views.html.model.product.editProduct;
import views.html.model.product.products;

import static play.data.Form.form;
/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class Products extends Controller {
  public static final Result GO_PRODUCTS = redirect(controllers.routes.Products.products());

  public static Result products() {
    return ok(products.render(Product.findAll()));
  }

  public static Result product(Long id) {
    Form<Product> productForm = form(Product.class);
    return ok(editProduct.render(Product.findById(id), productForm));
  }

  public static Result add() {
    Form<Product> productForm = form(Product.class);
    return ok(createProduct.render(productForm));
  }

  public static Result save() {
    Form<Product> productForm = form(Product.class).bindFromRequest();
    if (productForm.hasErrors()) {
      return badRequest(products.render(Product.findAll()));
    }
    productForm.get().save();
    return GO_PRODUCTS;
  }

  public static Result update(Long id) {
    Form<Product> productForm = form(Product.class).bindFromRequest();
    if (productForm.hasErrors()) {
      throw new RuntimeException(productForm.toString());
    }
    productForm.get().update(id);
    return GO_PRODUCTS;
  }


  public static Result delete(Long id) {
    Product.findById(id).delete();
    return GO_PRODUCTS;
  }

}

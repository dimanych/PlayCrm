package controllers;

import models.Contractor;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.model.contractor.*;

import static play.data.Form.form;

/**
 * @author Dmitriy Grigoriev
 */
public class Contractors extends Controller {

public static Result GO_CONTRACTORS = redirect(controllers.routes.Contractors.contractors());

  public static Result add() {
    Form<Contractor> contractorForm = form(Contractor.class);
    return ok(createContractor.render(contractorForm));
  }

  public static Result save() {
    Form<Contractor> contractorForm = form(Contractor.class).bindFromRequest();
    if (contractorForm.hasErrors()) {
      return badRequest(contractors.render(Contractor.findAll(), contractorForm));
    }
    contractorForm.get().save();
    return GO_CONTRACTORS;
  }

  public static Result delete(Long id) {
    Form<Contractor> contractorForm = form(Contractor.class).fill(Contractor.findById(id));
    if (contractorForm.hasErrors()) {
      return badRequest(contractors.render(Contractor.findAll(), contractorForm));
    }
    contractorForm.get().delete();
    return GO_CONTRACTORS;
  }

  public static Result contractors() {
    Form<Contractor> contractorForm = form(Contractor.class).bindFromRequest();
    return ok(contractors.render(Contractor.findAll(), contractorForm));
  }

  public static Result contractor(Long id) {
    return ok(contractor.render(Contractor.findById(id)));
  }
}

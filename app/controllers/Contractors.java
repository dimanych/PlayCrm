package controllers;

import models.Contractor;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.model.contractor;
import views.html.model.contractors;
import views.html.model.createContractor;

import java.util.List;

import static play.data.Form.form;

/**
 * @author Dmitriy Grigoriev
 */
public class Contractors extends Controller {

  public static Result add() {
//    Contact contact = new Contact();
//    contact.setName("jklkj");
//    contact.setPhone("5555");
//    contact.setPost("director");
//    contact.setContractor(Contractors.findById(1L));
//    Ebean.save(contact);
//    return redirect(routes.Application.contacts());
    Form<Contractor> contractorForm = form(Contractor.class);
    return ok(createContractor.render(contractorForm));
  }

  public static Result save() {
    Form<Contractor> contractorForm = form(Contractor.class).bindFromRequest();
    if (contractorForm.hasErrors()) {
      return badRequest(contractors.render(Contractor.findAll()));
    }
    contractorForm.get().save();
    return ok(contractors.render(Contractor.findAll()));
  }

  public static Result contractors() {
    return ok(contractors.render(Contractor.findAll()));
  }

  public static Result contractor(Long id) {
    return ok(contractor.render(Contractor.findById(id)));
  }
}

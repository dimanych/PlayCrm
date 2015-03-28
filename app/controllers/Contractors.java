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
  public static Model.Finder<Long, Contractor> find = new Model.Finder<Long, Contractor>(Long.class, Contractor.class);

  public static List<Contractor> findAll() {
    return find.all();
  }

  public static Contractor findById(Long id) {
    return find.byId(id);
  }

  public static Contractor findByName(String name) {
    return find.where().eq("name", name).findUnique();
  }

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
      return badRequest(contractors.render(findAll()));
    }
    contractorForm.get().save();
    return ok(contractors.render(findAll()));
  }

  public static Result contractors() {
    return ok(contractors.render(findAll()));
  }

  public static Result contractor(Long id) {
    return ok(contractor.render(Contractors.findById(id)));
  }
}

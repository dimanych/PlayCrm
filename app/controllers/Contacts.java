package controllers;

import models.Contact;
import play.data.Form;
import play.db.ebean.Model;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.model.contact;
import views.html.model.contacts;
import views.html.model.createContact;

import java.util.List;

import static play.data.Form.form;

/**
 * @author Dmitriy Grigoriev
 */
public class Contacts extends Controller {
  public static Model.Finder<Long, Contact> find = new Model.Finder<Long, Contact>(Long.class, Contact.class);

  public static List<Contact> findAll() {
    return find.all();
  }

  public static Contact findById(Long id) {
    return find.byId(id);
  }

  public static Contact findByName(String name) {
    return find.where().eq("name", name).findUnique();
  }

  public static Result add() {
    Form<Contact> contactForm = form(Contact.class);
    return ok(createContact.render(contactForm));
  }

  public static Result save() {
    Form<Contact> contractorForm = form(Contact.class).bindFromRequest();
    if (contractorForm.hasErrors()) {
      return badRequest(contacts.render(findAll()));
    }
    contractorForm.get().setContractor(Contractors.findById(1L));
    contractorForm.get().save();
    return ok(contacts.render(findAll()));
  }

  public static Result contacts() {
    return ok(contacts.render(Contacts.findAll()));
  }

  public static Result contact(Long id) {
    return ok(contact.render(Contacts.findById(id)));
  }
}

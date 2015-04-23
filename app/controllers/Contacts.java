package controllers;

import org.apache.commons.lang3.StringUtils;
import models.Contact;
import models.Contractor;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.model.contact.contact;
import views.html.model.contact.contacts;
import views.html.model.contact.createContact;

import java.util.List;

import static play.data.Form.form;

/**
 * Controller of Contacts
 *
 * @author Dmitriy Grigoriev
 */
public class Contacts extends Controller {

  public static final Result GO_CONTACTS = redirect(controllers.routes.Contacts.contacts());

  public static Result add() {
    Form<Contact> contactForm = form(Contact.class);
    return ok(createContact.render(contactForm));
  }

  public static Result save() {
    Form<Contact> contactForm = form(Contact.class).bindFromRequest();
    if (contactForm.hasErrors()) {
      return badRequest(contacts.render(Contact.findAll()));
    }
    contactForm.get().save();
    return GO_CONTACTS;
  }

  public static Result delete(Long id) {
    Contact.findById(id).delete();
    return GO_CONTACTS;
  }

  public static Result contacts() {
    return ok(contacts.render(Contact.findAll()));
  }

  public static Result contact(Long id) {
    return ok(contact.render(Contact.findById(id)));
  }

  public static List<Contact> contactsByContractor(Contractor contractor) {
    return Contact.findByContractor(contractor);
  }


  public static String contactNameByContractor(Contractor contractor) {
    Contact contact = contactsByContractor(contractor).get(0);
    return contact == null ? "" : contact.getName();
  }

  public static String phoneByContractor(Contractor contractor) {
    return Contact.findPhoneByContractor(contractor);
  }
}

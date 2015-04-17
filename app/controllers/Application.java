package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Application extends Controller {

  public static Result index() {
    return ok(index.render("Hi"));
  }

  public static String getDate() {
    DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date date = new Date();
    return dateFormat.format(date);
  }
}

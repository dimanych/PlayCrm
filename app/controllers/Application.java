package controllers;

import play.Routes;
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

  /**
   * Возвращает текущую дату
   *
   * @return дата вида дд.мм.гггг
   */
  public static String getCurrentDate() {
    DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
    Date date = new Date();
    return dateFormat.format(date);
  }

  // Simple GET example
  // curl http://localhost:9001/say1
  public static Result sayHello() {
    return ok("Hello Friend!");

  }
  // Javascript routing
  public static Result javascriptRoutes() {
    response().setContentType("text/javascript");
    return ok(Routes.javascriptRouter(
      "jsRoutes",
      routes.javascript.Application.sayHello()));
  }
}

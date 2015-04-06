import play.GlobalSettings;
import play.libs.F.Promise;
import play.mvc.Http.RequestHeader;
import play.mvc.Result;

import static play.mvc.Results.internalServerError;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class Global extends GlobalSettings {
  @Override
  public Promise<Result> onError(RequestHeader request, Throwable t) {
    return Promise.<Result>pure(internalServerError(
      views.html.errors.error.render(t)
    ));
  }
}

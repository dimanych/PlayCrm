package exceptions;

import org.apache.commons.lang3.Validate;
import validation.UserMsg;

import java.util.Arrays;
import java.util.List;

/**
 * Пользовательская ошибка.
 * <p>
 * Исключение предназначеное для пользоваетля. Например если выполнил недопустимые действия.
 * </p>
 *
 * @author Dmitriy Grigoriev
 */
public class UserException extends RuntimeException {
  private final List<UserMsg> userMsgs;

  public UserException(List<UserMsg> userMsgs) {
    super(Validate.notEmpty(userMsgs).get(0).getMessage());
    this.userMsgs = userMsgs;
  }

  public UserException(UserMsg... userMsgs) {
    this(Arrays.asList(userMsgs));
  }

  public UserException(String message) {
    this(new UserMsg(message, UserMsg.Type.ERROR));
  }

  public UserException(Throwable cause, List<UserMsg> userMsgs) {
    super(Validate.notEmpty(userMsgs).get(0).getMessage(), cause);
    this.userMsgs = userMsgs;
  }

  public UserException(Throwable cause, UserMsg... userMsgs) {
    this(cause, Arrays.asList(userMsgs));
  }

  public UserException(Throwable cause, String message) {
    this(cause, new UserMsg(message, UserMsg.Type.ERROR));
  }

  public List<UserMsg> getUserMsgs() {
    return userMsgs;
  }

}

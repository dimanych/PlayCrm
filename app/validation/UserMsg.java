package validation;

import org.apache.commons.lang3.Validate;

import java.io.Serializable;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public final class UserMsg implements Serializable {
  private final String message;
  private final Type type;

  public UserMsg(String aMessage, Type aType) {
    message = Validate.notNull(aMessage);
    type = Validate.notNull(aType);
  }


  public String getMessage() {
    return message;
  }

  public Type getType() {
    return type;
  }


  public enum Type {
    ERROR, WARNING, INFO, QUESTION, CONFIRMATION
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    UserMsg userMsg = (UserMsg) o;

    return message.equals(userMsg.message) && type == userMsg.type;
  }
}

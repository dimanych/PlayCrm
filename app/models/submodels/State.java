package models.submodels;

import play.i18n.Messages;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Состояние</p>
 *
 * @author Dmitriy Grigoriev
 */
public enum State {
  // Выполнен
  PERFORM(Messages.get("info.perform")),
  // Не выполнен
  UNPERFORMED(Messages.get("info.unperformed"));

  private String caption;

  State(String caption) {
    this.caption = caption;
  }

  public String caption() {
    return caption;
  }

  public static Map<String, String> options() {
    LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
    for (State state : values()) {
      options.put(state.name(), state.caption());
    }
    return options;
  }

}

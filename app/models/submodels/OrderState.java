package models.submodels;

import play.i18n.Messages;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p>Перечисление состояний заказа</p>
 *
 * @author Dmitriy Grigoriev
 */
public enum OrderState {
  /**
   * Планируется
   */
  PLANNED(Messages.get("info.planned")),
  /**
   * Обработка
   */
  PROCESSING(Messages.get("info.processing")),
  /**
   * Выполняется
   */
  PERFORMED(Messages.get("info.performed")),
  /**
   * Завершен
   */
  COMPLETED(Messages.get("info.completed")),
  /**
   * Отменен
   */
  CANCELED(Messages.get("info.canceled"));

  private String caption;

  OrderState(String caption) {
    this.caption = caption;
  }

  public String caption() {
    return caption;
  }

  public static Map<String, String> options() {
    LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
    for (OrderState orderState : values()) {
      options.put(orderState.name(), orderState.caption());
    }
    return options;
  }
}

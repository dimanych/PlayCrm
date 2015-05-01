package models.submodels;

import play.i18n.Messages;

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
}

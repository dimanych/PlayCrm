package models.submodels;

import play.i18n.Messages;

/**
 * <p>Перечисление оплат</p>
 *
 * @author Dmitriy Grigoriev
 */
public enum PaymentState {
  /**
   * Планируется
   */
  PLANNED(Messages.get("info.planned")),
  /**
   * Ожидание оплаты
   */
  WAITING(Messages.get("info.payment.waiting")),
  /**
   * Частично оплачено
   */
  PARTIALLY(Messages.get("info.payment.partially")),
  /**
   * Оплачено полностью
   */
  COMPLETED(Messages.get("info.payment.completed")),
  /**
   * Отменено
   */
  CANCELED(Messages.get("info.canceled"));

  private String caption;

  PaymentState(String caption) {
    this.caption = caption;
  }

  public String caption() {
    return caption;
  }
}

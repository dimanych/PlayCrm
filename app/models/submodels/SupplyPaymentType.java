package models.submodels;

import play.i18n.Messages;

/**
 * <p>Перечисление типов Оплат и Поставок</p>
 *
 * @author Dmitriy Grigoriev
 */
public enum SupplyPaymentType {
  /**
   * Поставка
   */
  SUPPLY(Messages.get("supply")),
  /**
   * Оплата
   */
  PAYMENT(Messages.get("payment"));

  private String caption;

  SupplyPaymentType(String caption) {
    this.caption = caption;
  }

  public String caption() {
    return caption;
  }
}

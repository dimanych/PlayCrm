package models;

import models.submodels.OrderState;
import models.submodels.PaymentState;
import models.submodels.SupplyPayment;
import models.submodels.SupplyState;

import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

/**
 * <p>Заказы</p>
 *
 * @author Dmitriy Grigoriev
 */
@Entity
public class Order extends BaseModel {
  /**
   * Номер
   */
  private Integer number;
  /**
   * Дата
   */
  private Date date;
  /**
   * Контрагент
   */
  private Contractor contractor;
  /**
   * Контакт
   */
  private Contact contact;
  /**
   * Плановая дата выполнения
   */
  private Date planExecutionDate;
  /**
   * Дата выполнения
   */
  private Date executionDate;
  /**
   * Итого
   */
  private Long amount;
  /**
   * Сумма оплаты
   */
  private Long payment;
  /**
   * Состояние заказа
   */
  private OrderState orderState;
  /**
   * Состояние оплаты
   */
  private PaymentState paymentState;
  /**
   * Состояние поставки
   */
  private SupplyState supplyState;
  /**
   * Сделка
   */
  private Deal deal;
  /**
   * Продукты
   */
  private List<Product> products;
  /**
   * График поставок и оплат
   */
  private List<SupplyPayment> supplyPayments;


}

package models;

import models.submodels.OrderState;
import models.submodels.PaymentState;
import models.submodels.SupplyState;
import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
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
  private Product product;
  /**
   * График поставок и оплат
   */
  private String supplyPayment;

  public static final Model.Finder<Long, Order> find = new Model.Finder<Long, Order>(Long.class, Order.class);

  public static List<Order> findAll() {
    return find.all();
  }

  public static Order findById(Long id) {
    return find.byId(id);
  }

  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  @OneToOne
  public Contractor getContractor() {
    return contractor;
  }

  public void setContractor(Contractor contractor) {
    this.contractor = contractor;
  }

  @OneToOne
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public Date getPlanExecutionDate() {
    return planExecutionDate;
  }

  public void setPlanExecutionDate(Date planExecutionDate) {
    this.planExecutionDate = planExecutionDate;
  }

  public Date getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(Date executionDate) {
    this.executionDate = executionDate;
  }

  public Long getAmount() {
    return amount;
  }

  public void setAmount(Long amount) {
    this.amount = amount;
  }

  public Long getPayment() {
    return payment;
  }

  public void setPayment(Long payment) {
    this.payment = payment;
  }

  public OrderState getOrderState() {
    return orderState;
  }

  public void setOrderState(OrderState orderState) {
    this.orderState = orderState;
  }

  public PaymentState getPaymentState() {
    return paymentState;
  }

  public void setPaymentState(PaymentState paymentState) {
    this.paymentState = paymentState;
  }

  public SupplyState getSupplyState() {
    return supplyState;
  }

  public void setSupplyState(SupplyState supplyState) {
    this.supplyState = supplyState;
  }

  @OneToOne
  public Deal getDeal() {
    return deal;
  }

  public void setDeal(Deal deal) {
    this.deal = deal;
  }

  @OneToOne
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public String getSupplyPayment() {
    return supplyPayment;
  }

  public void setSupplyPayment(String supplyPayment) {
    this.supplyPayment = supplyPayment;
  }
}

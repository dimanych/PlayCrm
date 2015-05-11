package models;

import models.submodels.OrderState;
import models.submodels.PaymentState;
import models.submodels.SupplyPayment;
import models.submodels.SupplyState;
import play.db.ebean.Model;
import utils.Util;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * <p>Заказы</p>
 *
 * @author Dmitriy Grigoriev
 */
@Entity
public class OrderEntity extends BaseModel {
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
  private BigDecimal amount;
  /**
   * Сумма оплаты
   */
  private BigDecimal payment;
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

  public static final Model.Finder<Long, OrderEntity> find = new Model.Finder<Long, OrderEntity>(Long.class, OrderEntity.class);

  public static List<OrderEntity> findAll() {
    return find.all();
  }

  public static OrderEntity findById(Long id) {
    return find.byId(id);
  }

  public String number() {
    return str(number);
  }

  public String jsDate() {
    return Util.jsDate(date);
  }

  public String jsExecutionDate() {
    return Util.jsDate(executionDate);
  }

  public String jsPlanExecutionDate() {
    return Util.jsDate(planExecutionDate);
  }

  public String amount() {
    return str(amount);
  }

  public String payment() {
    return str(payment);
  }

  private String str(Object val) {
    return String.valueOf(val);
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

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public BigDecimal getPayment() {
    return payment;
  }

  public void setPayment(BigDecimal payment) {
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

  @ManyToMany(mappedBy = "orders")
  public List<Product> getProducts() {
    return products;
  }

  public void setProducts(List<Product> products) {
    this.products = products;
  }

  @OneToMany(mappedBy = "order")
  public List<SupplyPayment> getSupplyPayments() {
    return supplyPayments;
  }

  public void setSupplyPayments(List<SupplyPayment> supplyPayments) {
    this.supplyPayments = supplyPayments;
  }
}

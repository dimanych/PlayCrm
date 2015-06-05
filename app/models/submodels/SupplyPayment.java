package models.submodels;

import models.BaseModel;
import models.OrderEntity;
import play.db.ebean.Model;
import utils.Util;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * <p>Графики поставок и оплат</p>
 *
 * @author Dmitriy Grigoriev
 */
@Entity
public class SupplyPayment extends BaseModel {
  /**
   * Тип(оплата или поставка)
   */
  private SupplyPaymentType supplyPaymentType;
  /**
    * Дата, план
    */
  private Date planDate;
  /**
   * Доля, %
   */
  private Integer percentage;
  /**
   * Сумма, план
   */
  private BigDecimal sumPlan;
  /**
   * Отсрочка, дней
   */
  private Integer delay;
  /**
   * Дата, факт
   */
  private Date factDate;
  /**
   * Состояние(выполнен или не выполнен)
   */
  private State state;
  /**
   * Сумма, факт
   */
  private BigDecimal sumFact;
  /**
   * Заказ
   */
  private OrderEntity order;

  public static final Model.Finder<Long, SupplyPayment> find = new Model.Finder<Long, SupplyPayment>(Long.class, SupplyPayment.class);

  public static List<SupplyPayment> findAll() {
    return find.all();
  }

  public static List<SupplyPayment> findList(Long orderId) {
    return find.where().eq("order.id", orderId).findList();
  }

  public static SupplyPayment findById(Long id) {
    return find.byId(id);
  }

  public String planDate() {
    return Util.jsDate(planDate);
  }

  public String percentage() {
    return String.valueOf(percentage);
  }

  public String sumPlan() {
    return String.valueOf(sumPlan);
  }

  public String sumPlanf() {
    return Util.getNumberFormatted(sumPlan);
  }

  public String delay() {
    return String.valueOf(delay);
  }

  public String factDate() {
    return Util.jsDate(factDate);
  }

  public String sumFact() {
    return String.valueOf(sumFact);
  }

  public String sumFactf() {
    return Util.getNumberFormatted(sumFact);
  }

  public SupplyPaymentType getSupplyPaymentType() {
    return supplyPaymentType;
  }

  public void setSupplyPaymentType(SupplyPaymentType supplyPaymentType) {
    this.supplyPaymentType = supplyPaymentType;
  }

  public Date getPlanDate() {
    return planDate;
  }

  public void setPlanDate(Date planDate) {
    this.planDate = planDate;
  }

  public Integer getPercentage() {
    return percentage;
  }

  public void setPercentage(Integer percentage) {
    this.percentage = percentage;
  }

  public BigDecimal getSumPlan() {
    return sumPlan;
  }

  public void setSumPlan(BigDecimal sumPlan) {
    this.sumPlan = sumPlan;
  }

  public Integer getDelay() {
    return delay;
  }

  public void setDelay(Integer delay) {
    this.delay = delay;
  }

  public Date getFactDate() {
    return factDate;
  }

  public void setFactDate(Date factDate) {
    this.factDate = factDate;
  }

  public State getState() {
    return state;
  }

  public void setState(State state) {
    this.state = state;
  }

  public BigDecimal getSumFact() {
    return sumFact;
  }

  public void setSumFact(BigDecimal sumFact) {
    this.sumFact = sumFact;
  }

  @ManyToOne
  public OrderEntity getOrder() {
    return order;
  }

  public void setOrder(OrderEntity order) {
    this.order = order;
  }
}

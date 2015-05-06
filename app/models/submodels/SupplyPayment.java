package models.submodels;

import models.BaseModel;
import models.OrderEntity;
import play.db.ebean.Model;
import play.i18n.Messages;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.util.ArrayList;
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
  private Long sumPlan;
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
  private String state;
  /**
   * Сумма, факт
   */
  private Long sumFact;
  /**
   * Заказ
   */
  private OrderEntity order;

  public static final Model.Finder<Long, SupplyPayment> find = new Model.Finder<Long, SupplyPayment>(Long.class, SupplyPayment.class);

  public static List<SupplyPayment> findAll() {
    return find.all();
  }

  public static List<SupplyPayment> findList(Long orderId) {
    List<SupplyPayment> list = new ArrayList<>();
    for (SupplyPayment item : find.all()) {
      if (item.order.getId().equals(orderId)) {
        list.add(item);
      }
    }

    return list;
  }

  public static SupplyPayment findById(Long id) {
    return find.byId(id);
  }


  private enum State {
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

  public Long getSumPlan() {
    return sumPlan;
  }

  public void setSumPlan(Long sumPlan) {
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

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public Long getSumFact() {
    return sumFact;
  }

  public void setSumFact(Long sumFact) {
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

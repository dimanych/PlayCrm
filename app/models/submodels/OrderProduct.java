package models.submodels;

import models.AbstractModel;
import models.OrderEntity;
import models.Product;
import play.db.ebean.Model;
import utils.Util;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.util.List;

/**
 * <p>Заказы - Продукты. Сущность используется для одноименной связки.</p>
 *
 * @author Dmitriy Grigoriev
 */
@Entity
public class OrderProduct extends AbstractModel {
  /**
   * Заказ
   */
  private OrderEntity order;
  /**
   * Продукт
   */
  private Product product;
  /**
   * Количество
   */
  private BigDecimal count;

  public static final Model.Finder<Long, OrderProduct> find = new Model.Finder<Long, OrderProduct>(Long.class, OrderProduct.class);

  public static OrderProduct findById(Long id) {
    return find.byId(id);
  }

  public static List<OrderProduct> findList(Long orderId) {
    return find.where().eq("order.id", orderId).findList();
  }

  public BigDecimal total() {
    BigDecimal val = BigDecimal.ZERO;
    if (product != null || count != null) {
      val = product.getPrice().multiply(count);
    }
    return val;
  }

  public String totalf() {
    return Util.getNumberFormatted(total());
  }

  @ManyToOne
  public OrderEntity getOrder() {
    return order;
  }

  public void setOrder(OrderEntity order) {
    this.order = order;
  }

  @ManyToOne
  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public BigDecimal getCount() {
    return count;
  }

  public void setCount(BigDecimal count) {
    this.count = count;
  }
}

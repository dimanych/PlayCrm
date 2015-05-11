package models.submodels;

import models.AbstractModel;
import models.OrderEntity;
import models.Product;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@Entity
public class OrderProduct extends AbstractModel {
  private OrderEntity order;
  private Product product;
  private Integer count;
  private BigDecimal total;

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

  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public BigDecimal getTotal() {
    return total;
  }

  public void setTotal(BigDecimal total) {
    this.total = total;
  }
}

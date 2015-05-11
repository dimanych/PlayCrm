package models;

import models.submodels.OrderProduct;
import play.db.ebean.Model;
import utils.Util;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import java.util.List;

/**
 * <p>Продукты</p>
 *
 * @author Dmitriy Grigoriev
 */
@Entity
public class Product extends BaseModel {
  /**
   * Код продукта
   */
  private Integer code;
  /**
   * Цена
   */
  private BigDecimal price;
  /**
   * Характеристики
   */
  private String characteristic;
  /**
   * Заказ
   */
  private List<OrderProduct> orders;

  public static final Model.Finder<Long, Product> find = new Model.Finder<Long, Product>(Long.class, Product.class);

  public static List<Product> findAll() {
    return find.all();
  }

  public static Product findById(Long id) {
    return find.byId(id);
  }

  public String code() {
    return String.valueOf(code);
  }

  public String price() {
    return String.valueOf(price);
  }

  public String pricef() {
    return Util.getNumberFormatted(price);
  }

  public String characteristic() {
    return String.valueOf(characteristic);
  }
  
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  public String getCharacteristic() {
    return characteristic;
  }

  public void setCharacteristic(String characteristic) {
    this.characteristic = characteristic;
  }

  @OneToMany(mappedBy = "product")
  public List<OrderProduct> getOrders() {
    return orders;
  }

  public void setOrders(List<OrderProduct> orders) {
    this.orders = orders;
  }
}

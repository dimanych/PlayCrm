package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
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
  private Long price;
  /**
   * Характеристики
   */
  private String characteristic;

  public static final Model.Finder<Long, Product> find = new Model.Finder<Long, Product>(Long.class, Product.class);

  public static List<Product> findAll() {
    return find.all();
  }

  public static Product findById(Long id) {
    return find.byId(id);
  }
  
  public Integer getCode() {
    return code;
  }

  public void setCode(Integer code) {
    this.code = code;
  }

  public Long getPrice() {
    return price;
  }

  public void setPrice(Long price) {
    this.price = price;
  }

  public String getCharacteristic() {
    return characteristic;
  }

  public void setCharacteristic(String characteristic) {
    this.characteristic = characteristic;
  }
}

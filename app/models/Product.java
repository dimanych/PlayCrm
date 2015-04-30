package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import java.util.List;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@Entity
public class Product extends BaseModel {
  private Integer code;
  private Long price;
  private String characteristic;

  public static final Model.Finder<Long, Product> find = new Model.Finder<Long, Product>(Long.class, Product.class);

  public static List<Product> findAll() {
    return find.all();
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

package models;

import javax.persistence.MappedSuperclass;

/**
 * <p>Base model</p>
 *
 * @author Dmitriy Grigoriev
 */
@MappedSuperclass
public class BaseModel extends AbstractModel {

  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

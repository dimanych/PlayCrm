package models;

import javax.persistence.Entity;

/**
 * @author Dmitriy Grigoriev
 */
@Entity
public class Contractor extends BaseModel {
  private String name;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

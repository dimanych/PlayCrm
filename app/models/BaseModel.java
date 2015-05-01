package models;

import javax.persistence.MappedSuperclass;

/**
 * <p>Базовая сущность</p>
 *
 * @author Dmitriy Grigoriev
 */
@MappedSuperclass
public class BaseModel extends AbstractModel {
  /**
   * Имя или наименование сущности
   */
  private String name;

  public String getName() {
    return name;
  }

  public String name() {
    return String.valueOf(name);
  }

  public void setName(String name) {
    this.name = name;
  }
}

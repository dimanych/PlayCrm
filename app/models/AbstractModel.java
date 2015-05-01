package models;

import play.db.ebean.Model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * <p>Abstract Entity</p>
 *
 * @author Dmitriy Grigoriev
 */
@MappedSuperclass
public class AbstractModel extends Model {

  /**
   * Идентификационный номер сущности
   */
  @Id
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}

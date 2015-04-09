package models;

import play.data.validation.Constraints;
import play.db.ebean.Model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@MappedSuperclass
public class AbstractModel extends Model {

  @Id
  @Constraints.Required
  private Long id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}

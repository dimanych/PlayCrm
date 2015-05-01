package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import java.util.List;

/**
 * <p>Фазы сделки</p>
 *
 * @author Dmitriy Grigoriev
 */
@Entity
public class DealPhase extends BaseModel {
  public static final Model.Finder<Long, DealPhase> find = new Model.Finder<Long, DealPhase>(Long.class, DealPhase.class);

  public static List<DealPhase> findAll() {
    return find.all();
  }
}

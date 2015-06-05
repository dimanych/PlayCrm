package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

  public static Map<String, String> options() {
    HashMap<String,String> options = new HashMap<String,String>();
    for (DealPhase dealPhase : findAll()) {
      options.put(dealPhase.id(), dealPhase.name());
    }
    return options;
  }
}

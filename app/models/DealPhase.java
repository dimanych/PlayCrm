package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import java.util.LinkedHashMap;
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
    LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
    for (DealPhase dealPhase : findAll()) {
      options.put(dealPhase.id(), dealPhase.name());
    }
    return options;
  }
}

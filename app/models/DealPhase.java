package models;

import play.db.ebean.Model;

import javax.persistence.Entity;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@Entity
public class DealPhase extends BaseModel {
  public static Model.Finder<Long, DealPhase> find = new Model.Finder<Long, DealPhase>(Long.class, DealPhase.class);
}

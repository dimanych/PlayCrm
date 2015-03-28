package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import java.util.List;

/**
 * @author Dmitriy Grigoriev
 */
@Entity
public class Contractor extends BaseModel {

  private String name;


  public static Model.Finder<Long, Contractor> find = new Model.Finder<Long, Contractor>(Long.class, Contractor.class);

  public static List<Contractor> findAll() {
    return find.all();
  }

  public static Contractor findById(Long id) {
    return find.byId(id);
  }

  public static Contractor findByName(String name) {
    return find.where().eq("name", name).findUnique();
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}

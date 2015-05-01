package models;

import play.db.ebean.Model;

import javax.persistence.Entity;

/**
 * <p>Типы контрагентов</p>
 *
 * @author Dmitriy Grigoriev
 */
@Entity
public class ContractorType extends BaseModel {
  public static final Model.Finder<Long, ContractorType> find = new Model.Finder<Long, ContractorType>(Long.class, ContractorType.class);
}

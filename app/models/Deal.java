package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@Entity
public class Deal extends BaseModel {
  private Contractor contractor;
  private DealPhase dealPhase;

  public static Model.Finder<Long, Deal> find = new Model.Finder<Long, Deal>(Long.class, Deal.class);

  public static List<Deal> findAll() {
    return find.all();
  }

  public static Deal findById(Long id) {
    return find.byId(id);
  }

  public static List<Deal> findByContractor(Contractor contractor) {
    return find.where().eq("contractor", contractor).findList();
  }

  @OneToOne
  public Contractor getContractor() {
    return contractor;
  }

  public void setContractor(Contractor contractor) {
    this.contractor = contractor;
  }

  @OneToOne
  public DealPhase getDealPhase() {
    return dealPhase;
  }

  public void setDealPhase(DealPhase dealPhase) {
    this.dealPhase = dealPhase;
  }
}

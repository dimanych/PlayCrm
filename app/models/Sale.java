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
public class Sale extends BaseModel {
  private Contractor contractor;
  private SalePhase salePhase;

  public static Model.Finder<Long, Sale> find = new Model.Finder<Long, Sale>(Long.class, Sale.class);

  public static List<Sale> findAll() {
    return find.all();
  }

  @OneToOne
  public Contractor getContractor() {
    return contractor;
  }

  public void setContractor(Contractor contractor) {
    this.contractor = contractor;
  }

  @OneToOne
  public SalePhase getSalePhase() {
    return salePhase;
  }

  public void setSalePhase(SalePhase salePhase) {
    this.salePhase = salePhase;
  }
}

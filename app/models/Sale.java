package models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
@Entity
public class Sale extends BaseModel {
  private Contractor contractor;
  private SalePhase salePhase;

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

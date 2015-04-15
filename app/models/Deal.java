package models;

import play.db.ebean.Model;
import utils.Util;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.util.Date;
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
  private Date startDate;
  private Date endDate;
  private BigDecimal budget;

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

  public Date getStartDate() {
    return startDate;
  }

  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  public Date getEndDate() {
    return endDate;
  }

  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }

  public BigDecimal getBudget() {
    return budget;
  }

  public void setBudget(BigDecimal budget) {
    this.budget = budget;
  }


  public String getBudgetFormatted() {
    return Util.getNumberFormatted(getBudget());
  }
}

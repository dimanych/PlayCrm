package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.util.List;

/**
 * <p>Контакты</p>
 *
 * @author Dmitriy Grigoriev
 */
@Entity
public class Contact extends BaseModel {
  /**
   * Контрагент
   */
  private Contractor contractor;
  /**
   * Должность
   */
  private String post;
  /**
   * Средства связи
   */
  private Communication communication;
  /**
   * Адрес
   */
  private String adress;

  public static final Model.Finder<Long, Contact> find = new Model.Finder<Long, Contact>(Long.class, Contact.class);

  public static List<Contact> findAll() {
    return find.all();
  }

  public static Contact findById(Long id) {
    return find.byId(id);
  }

  public static List<Contact> findByContractor(Contractor contractor) {
    return find.where().eq("contractor", contractor).findList();
  }

  public static String findPhoneByContractor(Contractor contractor) {
    Contact contact = find.where().eq("contractor", contractor).findUnique();
    return contact == null ? null : contact.getCommunication() == null ? null : contact.getCommunication().getWorkPhone();
  }

  @Override
  public void save() {
    this.communication.save();
    super.save();
  }

  @ManyToOne
  public Contractor getContractor() {
    return contractor;
  }

  public void setContractor(Contractor contractor) {
    this.contractor = contractor;
  }

  public String getPost() {
    return post;
  }

  public void setPost(String post) {
    this.post = post;
  }

  @OneToOne
  public Communication getCommunication() {
    return communication;
  }

  public void setCommunication(Communication communication) {
    this.communication = communication;
  }

  public String getAdress() {
    return adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }
}

package models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

/**
 * <p>Entity contacts </p>
 *
 * @author Dmitriy Grigoriev
 */
@Entity
public class Contact extends BaseModel {
  private String name;
  private Contractor contractor;
  private String post;
  private String phone;
  private String adress;

  public Contact() {
  }

  public Contact(String name, Contractor contractor, String post, String phone, String adress) {
    this.name = name;
    this.contractor = contractor;
    this.post = post;
    this.phone = phone;
    this.adress = adress;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @OneToOne
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

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getAdress() {
    return adress;
  }

  public void setAdress(String adress) {
    this.adress = adress;
  }
}

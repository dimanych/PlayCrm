package models;

import javax.persistence.Entity;

/**
 * <p>Средства связи</p>
 *
 * @author Dmitriy Grigoriev
 */
@Entity
public class Communication extends AbstractModel {
  /**
   * Домашний телефон
   */
  private String homePhone;
  /**
   * Мобильный телефон
   */
  private String mobilePhone;
  /**
   * Рабочий телефон
   */
  private String workPhone;
  /**
   * Скайп
   */
  private String skype;
  /**
   * Электронная почта
   */
  private String email;
  /**
   * Сайт
   */
  private String www;
  /**
   * Аккаунт в социальной сети
   */
  private String socialAccount;
  /**
   * Другие способы связи
   */
  private String other;

  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public String getWorkPhone() {
    return workPhone;
  }

  public void setWorkPhone(String workPhone) {
    this.workPhone = workPhone;
  }

  public String getSkype() {
    return skype;
  }

  public void setSkype(String skype) {
    this.skype = skype;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getWww() {
    return www;
  }

  public void setWww(String www) {
    this.www = www;
  }

  public String getSocialAccount() {
    return socialAccount;
  }

  public void setSocialAccount(String socialAccount) {
    this.socialAccount = socialAccount;
  }

  public String getOther() {
    return other;
  }

  public void setOther(String other) {
    this.other = other;
  }
}

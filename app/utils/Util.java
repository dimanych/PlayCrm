package utils;

import models.BaseModel;
import org.apache.commons.lang3.StringUtils;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class Util {

  public static String getNumberFormatted(BigDecimal val) {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    return val == null ? "" : formatter.format(val);
  }

  /**
   * Конвертирует дату типа Date
   * для отображения на страничке просмотра
   *
   * @param date дата типа Date
   * @return дата вида дд.мм.гггг
   */
  public static String jsDate(Date date) {
    DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
    if (date == null) {
      return StringUtils.EMPTY;
    }
    return dateFormat.format(date);
  }

  /**
   * Вытягиваем name из объекта
   *
   * @param model
   * @return name или пустая строка
   */
  public static String name(BaseModel model) {
    if (model != null) {
      return model.name();
    }
    return StringUtils.EMPTY;
  }

  /**
   * Вытягиваем id из объекта
   *
   * @param model
   * @return id или пустая строка
   */
  public static String id(BaseModel model) {
    if (model != null) {
      return model.id();
    }
    return StringUtils.EMPTY;
  }

}

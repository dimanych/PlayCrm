package utils;

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
      date = new Date();
    }
    return dateFormat.format(date);
  }

}

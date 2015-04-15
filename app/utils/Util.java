package utils;

import java.math.BigDecimal;
import java.text.NumberFormat;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class Util {

  public static String getNumberFormatted(BigDecimal val) {
    NumberFormat formatter = NumberFormat.getCurrencyInstance();
    return formatter.format(val);
  }

}

package analytics;

import controllers.Orders;
import models.chart.CircleChartData;

import java.util.List;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class OrderGraph {

  /**
   * <p>Возвращает данные для графика по типам Сделок</p>
   *
   * @return список элементов {@link models.chart.CircleChartData}
   */
  public static List<CircleChartData> billState() {
    return Orders.billState();
  }
}

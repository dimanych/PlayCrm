package analytics;

import models.OrderEntity;
import models.chart.CircleChartData;
import models.submodels.PaymentState;
import utils.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class OrderGraph {

  /**
   * <p>Возвращает данные для графика: состояние оплаты</p>
   *
   * @return список элементов {@link models.chart.CircleChartData}
   */
  public static List<CircleChartData> billState() {
    List<CircleChartData> chart = new ArrayList<>();
    int i = 0;

    for (PaymentState paymentState : PaymentState.values()) {
      Integer paymentStateCount = OrderEntity.paymentStateCount(paymentState);
      if (paymentStateCount > 0) {
        String color = Color.Light.values()[i].hex();
        String highlight = Color.Normal.values()[i].hex();
        chart.add(new CircleChartData(paymentStateCount, color, highlight, paymentState.caption()));
        i++;
      }

    }

    return chart;
  }
}

package analytics;

import models.Deal;
import models.DealPhase;
import models.chart.BarChartData;
import models.chart.CircleChartData;
import utils.Color;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class DealGraph {

  /**
   * <p>Возвращает данные для графика по типам Сделок</p>
   *
   * @return список элементов {@link CircleChartData}
   */
  public static List<CircleChartData> chartDeals() {
    List<CircleChartData> chart = new ArrayList<>();
    int i = 0;
    for (DealPhase dealPhase : DealPhase.findAll()) {
      String color = Color.Light.values()[i].hex();
      String highlight = Color.Normal.values()[i].hex();
      chart.add(new CircleChartData(Deal.countDealsByPhase(dealPhase.getId()), color, highlight, dealPhase.getName()));
      i++;
    }
    return chart;
  }

  /**
   * <p>Возвращает данные для графика воронки продаж</p>
   *
   * @return список элементов {@link BarChartData}
   */
  public static List<BarChartData> salesFunnel() {
    List<BarChartData> chart = new ArrayList<>();
    List<Integer> data = new ArrayList<>();
    for (DealPhase dealPhase : DealPhase.findAll()) {
      data.add(Deal.countDealsByPhase(dealPhase.getId()));
    }
    chart.add(new BarChartData(data));
    return chart;
  }


}

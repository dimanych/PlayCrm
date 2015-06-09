package analytics;

import models.Deal;
import models.DealPhase;
import models.chart.BarChartData;
import models.chart.CircleChartData;
import utils.Color;

import java.util.ArrayList;
import java.util.Collections;
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
  public static BarChartData salesFunnel() {
    List<Integer> data = new ArrayList<>();
    List<String> captions = new ArrayList<>();
    List<DealPhase> dealPhases = DealPhase.findAll();
    Collections.reverse(dealPhases);
    Integer deals = 0;
    for (DealPhase dealPhase : dealPhases) {
      deals += Deal.countDealsByPhase(dealPhase.getId());
      data.add(deals);
      captions.add(dealPhase.getName());
    }
    return new BarChartData(captions, data);
  }
}

package controllers;

import models.DealPhase;
import play.mvc.Controller;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class DealPhases extends Controller {
  public static Map<String,String> options() {
    LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
    for(DealPhase contractorType: DealPhase.find.orderBy("name").findList()) {
      options.put(String.valueOf(contractorType.getId()), contractorType.getName());
    }
    return options;
  }
}

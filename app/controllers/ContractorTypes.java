package controllers;

import models.ContractorType;
import play.mvc.Controller;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class ContractorTypes extends Controller {

  public static Map<String,String> options() {
    LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
    for(ContractorType contractorType: ContractorType.find.orderBy("name").findList()) {
      options.put(String.valueOf(contractorType.getId()), contractorType.getName());
    }
    return options;
  }
}

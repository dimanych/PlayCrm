package utils;

import models.Contractor;
import play.data.validation.ValidationError;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class ContractorUtil {

  public static Boolean ableDelete(Contractor contractor){
    List<ValidationError> errors = new ArrayList<ValidationError>();
    if (errors.isEmpty()) {
      throw new RuntimeException("Удалять нельзя");
    }
    return errors.isEmpty();
  }
}

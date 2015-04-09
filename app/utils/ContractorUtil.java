package utils;

import play.data.validation.ValidationError;

import java.util.ArrayList;
import java.util.List;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class ContractorUtil {

  public static List<ValidationError> checkBeforeDelete(){
    List<ValidationError> errors = new ArrayList<ValidationError>();

    return errors.isEmpty() ? null : errors;
  }
}

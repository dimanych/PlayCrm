package utils;

import play.data.validation.ValidationError;
import play.db.ebean.Model;

import java.util.List;

/**
 * <p></p>
 *
 * @author Dmitriy Grigoriev
 */
public class ContractorForm extends Model {

  public List<ValidationError> validate() {
    return ContractorUtil.checkBeforeDelete();
  }
}

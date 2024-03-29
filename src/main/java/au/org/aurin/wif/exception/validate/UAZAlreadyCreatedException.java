/**
 *
 * marcosnr
 * 19/03/2012
 */
package au.org.aurin.wif.exception.validate;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * <b>DataStoreUnavailableException.java</b> : throws exceptions if the DataStore 
 * is not available
 * meet the WIF criteria to perform a successful Analysis
 * 
 * @author <a href="mailto:marcosnr@unimelb.edu.au"> Marcos Nino-Ruiz
 *         marcosnr@unimelb.edu.au</a> - 2012
 */
@ResponseStatus(value = HttpStatus.FORBIDDEN, reason = "UAZ has already been created")
public class UAZAlreadyCreatedException extends Exception {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1124576769564144835L;

  /**
   * Instantiates a new wif invalid input exception.
   */
  public UAZAlreadyCreatedException() {
  }

  /**
   * Instantiates a new wif invalid input exception.
   *
   * @param message the message
   */
  public UAZAlreadyCreatedException(String message) {
    super(message);
  }

  /**
   * Instantiates a new wif invalid input exception.
   *
   * @param cause the cause
   */
  public UAZAlreadyCreatedException(Throwable cause) {
    super(cause);
  }

  /**
   * Instantiates a new wif invalid input exception.
   *
   * @param message the message
   * @param cause the cause
   */
  public UAZAlreadyCreatedException(String message, Throwable cause) {
    super(message, cause);
  }

}

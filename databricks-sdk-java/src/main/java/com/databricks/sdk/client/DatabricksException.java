package com.databricks.sdk.client;

/**
 * <p>DatabricksException class.</p>
 *
 * @author tanmay.rustagi
 * @version $Id: $Id
 */
public class DatabricksException extends RuntimeException {
  /**
   * <p>Constructor for DatabricksException.</p>
   *
   * @param message a {@link java.lang.String} object
   */
  public DatabricksException(String message) {
    super(message);
  }

  /**
   * <p>Constructor for DatabricksException.</p>
   *
   * @param message a {@link java.lang.String} object
   * @param cause a {@link java.lang.Throwable} object
   */
  public DatabricksException(String message, Throwable cause) {
    super(message, cause);
  }
}

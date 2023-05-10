package com.databricks.sdk.core;

public class DatabricksException extends RuntimeException {
  public DatabricksException(String message) {
    super(message);
  }

  public DatabricksException(String message, Throwable cause) {
    super(message, cause);
  }
}

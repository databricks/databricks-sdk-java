package com.databricks.sdk.core;

import static com.databricks.sdk.core.DatabricksError.ERROR_INFO_TYPE;

import com.databricks.sdk.core.error.ErrorDetail;
import java.util.Collections;
import java.util.List;

public class DatabricksException extends RuntimeException {
  public DatabricksException(String message) {
    super(message);
  }

  public DatabricksException(String message, Throwable cause) {
    super(message, cause);
  }

  public List<ErrorDetail> getErrorInfo() {
    if (!(this instanceof DatabricksError)) {
      return Collections.emptyList();
    }
    return ((DatabricksError) this).getErrorsOfType(ERROR_INFO_TYPE);
  }
}

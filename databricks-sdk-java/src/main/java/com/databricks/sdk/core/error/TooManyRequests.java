// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.support.Generated;
import java.util.List;

/** maps to HTTP code: 429 Too Many Requests */
@Generated
public class TooManyRequests extends DatabricksError {
  public TooManyRequests(String message, List<ErrorDetail> details) {
    super("TOO_MANY_REQUESTS", message, 429, details);
  }

  TooManyRequests(String errorCode, String message, int statusCode, List<ErrorDetail> details) {
    super(errorCode, message, statusCode, details);
  }
}

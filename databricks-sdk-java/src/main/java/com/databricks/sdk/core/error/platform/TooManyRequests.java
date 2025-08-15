// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/** maps to HTTP code: 429 Too Many Requests */
@Generated
public class TooManyRequests extends DatabricksError {
  public TooManyRequests(String message, ErrorDetails details) {
    super("TOO_MANY_REQUESTS", message, 429, details);
  }

  public TooManyRequests(String errorCode, String message, ErrorDetails details) {
    super(errorCode, message, 429, details);
  }
}

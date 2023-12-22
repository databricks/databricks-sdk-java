// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.support.Generated;
import java.util.List;

/** the service is currently unavailable */
@Generated
public class TemporarilyUnavailable extends DatabricksError {
  public TemporarilyUnavailable(String message, List<ErrorDetail> details) {
    super("TEMPORARILY_UNAVAILABLE", message, 503, details);
  }

  TemporarilyUnavailable(
      String errorCode, String message, int statusCode, List<ErrorDetail> details) {
    super(errorCode, message, statusCode, details);
  }
}

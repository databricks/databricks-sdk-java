// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/** the service is currently unavailable */
@Generated
public class TemporarilyUnavailable extends DatabricksError {
  public TemporarilyUnavailable(String message, ErrorDetails details) {
    super("TEMPORARILY_UNAVAILABLE", message, 503, details);
  }

  public TemporarilyUnavailable(String errorCode, String message, ErrorDetails details) {
    super(errorCode, message, 503, details);
  }
}

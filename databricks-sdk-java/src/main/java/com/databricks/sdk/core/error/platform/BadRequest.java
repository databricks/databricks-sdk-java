// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/** the request is invalid */
@Generated
public class BadRequest extends DatabricksError {
  public BadRequest(String message, ErrorDetails details) {
    super("BAD_REQUEST", message, 400, details);
  }

  public BadRequest(String errorCode, String message, ErrorDetails details) {
    super(errorCode, message, 400, details);
  }
}

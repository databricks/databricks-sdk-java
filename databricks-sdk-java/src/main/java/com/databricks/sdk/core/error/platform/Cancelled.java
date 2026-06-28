// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/** the operation was explicitly canceled by the caller */
@Generated
public class Cancelled extends DatabricksError {
  public Cancelled(String message, ErrorDetails details) {
    super("CANCELLED", message, 499, details);
  }

  public Cancelled(String errorCode, String message, ErrorDetails details) {
    super(errorCode, message, 499, details);
  }
}

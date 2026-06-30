// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/** some invariants expected by the underlying system have been broken */
@Generated
public class InternalError extends DatabricksError {
  public InternalError(String message, ErrorDetails details) {
    super("INTERNAL_ERROR", message, 500, details);
  }

  public InternalError(String errorCode, String message, ErrorDetails details) {
    super(errorCode, message, 500, details);
  }
}

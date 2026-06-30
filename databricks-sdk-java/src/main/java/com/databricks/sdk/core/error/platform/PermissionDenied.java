// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error.platform;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.core.error.details.ErrorDetails;
import com.databricks.sdk.support.Generated;

/** the caller does not have permission to execute the specified operation */
@Generated
public class PermissionDenied extends DatabricksError {
  public PermissionDenied(String message, ErrorDetails details) {
    super("PERMISSION_DENIED", message, 403, details);
  }

  public PermissionDenied(String errorCode, String message, ErrorDetails details) {
    super(errorCode, message, 403, details);
  }
}

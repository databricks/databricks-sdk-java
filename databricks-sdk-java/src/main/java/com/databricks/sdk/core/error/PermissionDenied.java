// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.support.Generated;
import java.util.List;

/** the caller does not have permission to execute the specified operation */
@Generated
public class PermissionDenied extends DatabricksError {
  public PermissionDenied(String message, List<ErrorDetail> details) {
    super("PERMISSION_DENIED", message, 403, details);
  }

  PermissionDenied(String errorCode, String message, List<ErrorDetail> details) {
    super(errorCode, message, 403, details);
  }
}

// Code generated from OpenAPI specs by Databricks SDK Generator. DO NOT EDIT.

package com.databricks.sdk.core.error;

import com.databricks.sdk.core.DatabricksError;
import com.databricks.sdk.support.Generated;
import java.util.List;

/** maps to all HTTP 409 (Conflict) responses */
@Generated
public class ResourceConflict extends DatabricksError {
  public ResourceConflict(String message, List<ErrorDetail> details) {
    super("RESOURCE_CONFLICT", message, 409, details);
  }

  ResourceConflict(String errorCode, String message, int statusCode, List<ErrorDetail> details) {
    super(errorCode, message, statusCode, details);
  }
}
